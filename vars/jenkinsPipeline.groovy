import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline


def call() {

    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    //sh "echo 'Building the project'"
                    script {
                        def jenkinsPipeline = new JenkinsPipeline(this)
                        jenkinsPipeline.call(this)
                    }
                }
            }

            stage('Test') {
                steps {
                    sh "echo 'Testing the project'"
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