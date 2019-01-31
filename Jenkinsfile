pipeline {
  agent any
  stages {
    stage('Unit tests') {
      steps {
        sh 'echo \'Unit tests are running\''
      }
    }
    stage('Integration tests') {
      parallel {
        stage('Integration tests') {
          steps {
            sh 'echo \'Integration tests\''
          }
        }
        stage('') {
          steps {
            build(job: 'UI_tests', propagate: true, wait: true)
          }
        }
      }
    }
    stage('') {
      steps {
        sh 'echo \'Deploy\''
      }
    }
  }
}