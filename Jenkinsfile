pipeline {
  agent any
  stages {
    stage('Unit Tests') {
      steps {
        build(job: 'Unit tests', propagate: true, wait: true)
      }
    }
    stage('Integration Tests') {
      parallel {
        stage('Integration Tests') {
          steps {
            build(job: 'Integration tests', propagate: true, wait: true)
          }
        }
        stage('UI Tests') {
          steps {
            build(job: 'UI tests', propagate: true, wait: true)
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo \'Deploy!\''
      }
    }
  }
}