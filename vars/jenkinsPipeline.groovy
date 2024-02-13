import io.sdlc.jenkins.pipeline.stages.JenkinsPipeline

def call(body) {
    // Parse the passed parameters
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def pipeline = new JenkinsPipeline()

    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    pipeline.build()
                }
            }

            stage('Test') {
                steps {
                    pipeline.test()
                }
            }

            stage('Sonar Scan') {
                steps {
                    pipeline.sonarScan()
                }
            }

            stage('Deploy') {
                steps {
                    pipeline.deploy()
                }
            }
        }
    }
}