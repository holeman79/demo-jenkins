pipeline {
    agent any

    parameters {
        choice(name: 'PROJECT_NAME', choices: ['api-server', 'message-subscriber'], description: 'PROJECT_NAME')
    }

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
            echo "PROJECT_NAME : ${params.PROJECT_NAME}"

            script {
                if (${params.PROJECT_NAME} == 'api-server') {
                   echo 'project name '
                }
            }
          }
        }
    }
}