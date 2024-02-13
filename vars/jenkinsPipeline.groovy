import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline


def call() {

    def pipeline = new JenkinsPipeline(this)


    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                   pipeline.build()
                    sh "echo 'Building the project'"
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

//    // Parse the passed parameters
//    def config = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = config
//    body()
//
//    def pipeline = new JenkinsPipeline()
//
//    pipeline {
//        agent any
//
//        stages {
//            stage('Build') {
//                steps {
//                    pipeline.build()
//                }
//            }
//
//            stage('Test') {
//                steps {
//                    pipeline.test()
//                }
//            }
//
//            stage('Sonar Scan') {
//                steps {
//                    pipeline.sonarScan()
//                }
//            }
//
//            stage('Deploy') {
//                steps {
//                    pipeline.deploy()
//                }
//            }
//        }
//    }
}