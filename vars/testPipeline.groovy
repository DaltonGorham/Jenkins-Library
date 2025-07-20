def call() {
  pipeline {
    agent any

    stages {
      loopStage()
    }
  }
}