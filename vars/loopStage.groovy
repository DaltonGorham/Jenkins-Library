// Helper method that actually does the looping
def loop(int start, int end) {
    echo "Looping from ${start} to ${end}"
    for (int i = start; i <= end; i++) {
        echo "Iteration: ${i}"
    }
}

// The entry point Jenkins calls
def call(int start = 1, int end = 5) {
    stage('Loop') {
        steps {
            script {
                loop(start, end)
            }
        }
    }
}