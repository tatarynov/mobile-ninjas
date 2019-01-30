pipeline {
  agent any
  stages {
    stage('Integration Test') {
      parallel {
        stage('Integration Test') {
          steps {
            build(job: 'Integration tests', propagate: true, wait: true)
          }
        }
        stage('UI Test') {
          steps {
            build(job: 'UI tests', propagate: true, wait: true)
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo \'Deploying...\''
      }
    }
  }
}