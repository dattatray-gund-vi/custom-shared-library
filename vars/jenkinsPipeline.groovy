import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline


def call() {

    def jenkinsPipeline = new JenkinsPipeline(this)

    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    script {
                        jenkinsPipeline.call()
                    }
                }
            }

            stage('Test') {
                steps {
                    //sh "echo 'Testing the project'"
                    println("Testing the project")
                }
            }

            stage('Sonar Scan') {
                steps {
                    sh "echo 'Running SonarQube scan'"
                }
            }

            stage('Deploy') {
                steps {
                    sh "echo 'Deploying the project'"
                }
            }
        }
    }
}