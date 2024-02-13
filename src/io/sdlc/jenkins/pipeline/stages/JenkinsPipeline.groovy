package io.sdlc.jenkins.pipeline.stages

class JenkinsPipeline {

    def csScriptContext

    JenkinsPipeline(def csScriptContext) {
        this.csScriptContext = csScriptContext
    }


    def void build() {
        println("Building the project")
    }

}