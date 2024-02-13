package io.sdlc.jenkins.pipeline.stages

class JenkinsPipeline {

    def csScriptContext

    JenkinsPipeline(def csScriptContext) {
        this.csScriptContext = csScriptContext
    }


    def void call(def csScriptContext) {
        println("Building the project")
        csScriptContext.sh "echo 'Building the project'"
    }

}