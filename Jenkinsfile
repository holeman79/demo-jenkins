pipeline {
    agent any

    environment {
        imagename = "holeman79/demo-jenkins"
        registryCredential = 'docker-hub'
        dockerImage = ''
    }

    stages {
        // git에서 repository clone
        stage('Prepare') {
          steps {
            echo 'Clonning Repository'
            git url: 'https://github.com/holeman79/demo-jenkins.git',
              branch: 'master',
              credentialsId: 'github-access'
            }
            post {
             success {
               echo 'Successfully Cloned Repository'
             }
           	 failure {
               error 'This pipeline stops here...'
             }
          }
        }

        // gradle build
        stage('Bulid Gradle') {
          agent any
          steps {
            echo 'Bulid Gradle'
            dir ('.'){
                sh """
                ./gradlew clean build --exclude-task test
                """
            }
          }
          post {
            failure {
              error 'This pipeline stops here...'
            }
          }
        }

        // docker build
        stage('Bulid Docker') {
          agent any
          steps {
            echo 'Bulid Docker'
            script {
                dockerImage = docker.build imagename
            }
          }
          post {
            failure {
              error 'This pipeline stops here...'
            }
          }
        }

        // docker push
        stage('Push Docker') {
          agent any
          steps {
            echo 'Push Docker!!'
            script {
                docker.withRegistry( '', registryCredential) {
                    dockerImage.push("1.0")  // ex) "1.0"
                }
            }
          }
          post {
            failure {
              error 'This pipeline stops here...'
            }
          }
        }

        // Server Docker pull
        stage('SSH api server') {
          agent any
          steps {
              echo 'SSH'

              sshagent(credentials: ['api-server-ssh-access']) {
                  sh 'ssh -o StrictHostKeyChecking=no root@10.0.202.6 "whoami"'
                  sh "ssh -o StrictHostKeyChecking=no root@10.0.202.6 'docker pull holeman79/demo-jenkins:1.0'"
                  sh "ssh -o StrictHostKeyChecking=no root@10.0.202.6 'docker run -p 8080:8080 -d -name demo holeman79/demo-jenkins:1.0'"
              }
          }
          post {
            success {
              echo 'Successfully finished running on api-server'
            }
            failure {
              error 'This pipeline stops here...'
            }
          }
        }
    }
}