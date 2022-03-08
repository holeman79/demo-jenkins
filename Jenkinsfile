pipeline {
    agent any

    environment {
        imagename = "holeman79/demo-jenkins"
        registryCredential = 'docker-hub'
        dockerImage = ''
        PROJECT_NAME = "${PROJECT_NAME}"
    }

    stages {

        stage('Prepare') {

          steps {
            echo 'Exercise Step'
            echo 'env.PROJECT_NAME'

            script {
                if (${PROJECT_NAME} == 'api-server') {
                   echo 'project name '
                }
            }
          }
        }
    }
}