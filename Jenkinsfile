pipeline {
    agent any

    parameters {
        choice(name: 'PROJECT_NAME', choices: ['api-server', 'message-subscriber'], description: 'PROJECT_NAME')
    }

    environment {
        imagename = "holeman79/demo-jenkins"
        registryCredential = 'docker-hub'
        dockerImage = ''
        serverIp = ''
    }



    stages {

        stage('Prepare') {

          steps {
            script {
                              if ("${params.PROJECT_NAME}" == 'api-server') {
                                 serverIp = "1";
                              } else if ("${params.PROJECT_NAME}" == 'message-subscriber') {
                                 serverIp = "2";
                              }
                          }
            echo 'Exercise Step'
            echo "PROJECT_NAME : ${params.PROJECT_NAME}"
            echo "serverIp : ${env.serverIp}"

            echo serverIp
          }
        }
    }
}