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

                       // info 'This is an info message'

                        // Print a warning message
                        warning 'This is a warning message'

                        // Print a severe message
                        error 'This is a severe message'
                    }
                }
            }

            stage('Test') {
                steps {
                    //sh "echo 'Testing the project'"
                    println("--------- Testing the project ---------")
                   // info 'This is an info message'

                    // Print a warning message
                    warning 'This is a warning message'

                    // Print a severe message
                    error 'This is a severe message'


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