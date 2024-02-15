import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline
import java.util.logging.Logger

def call() {

    def jenkinsPipeline = new JenkinsPipeline(this)
    Logger logger = Logger.getLogger(getClass().getName())

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
                    println("--------- Testing the project ---------")

                    logger.info("Hello, this is an informational message")
                    logger.warning("This is a warning message")
                    logger.severe("This is a severe message")
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