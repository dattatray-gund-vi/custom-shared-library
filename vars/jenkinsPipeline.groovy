import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline
//import java.util.logging.Logger
//import jenkins.model.Jenkins//

def call() {

    def jenkinsPipeline = new JenkinsPipeline(this)
//    Logger logger = Logger.getLogger(getClass().getName())
   // def logger = Jenkins.instance.getLogger(getClass().getName())

    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    script {
                        jenkinsPipeline.call()
                        info "Hello, this is an informational message"
                        warning("This is a warning message")
                        error("This is a severe message")
                    }
                }
            }

            stage('Test') {
                steps {
                    //sh "echo 'Testing the project'"
                    println("--------- Testing the project ---------")


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