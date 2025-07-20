def call(String name = "Dalton") {
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo "Hello from testPipeline, ${name}!"
                }
            }
        }
    }
}
