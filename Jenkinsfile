pipeline {
    agent any

    environment {
        imagename = "holeman79/demo-jenkins"
        registryCredential = 'docker-hub'
        dockerImage = ''
    }

    stages {

        stage('Prepare') {
          if (params.PROJECT_NAME == 'api-server') {
            echo 'project name '
          }
          steps {
            echo 'Exercise Step'

            post {
                 success {
                   echo 'Successfully Cloned Repository'
                 }
                 failure {
                   error 'This pipeline stops here...'
                 }
            }
          }
        }
    }
}