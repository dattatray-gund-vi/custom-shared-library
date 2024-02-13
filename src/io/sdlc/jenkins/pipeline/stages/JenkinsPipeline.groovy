package io.sdlc.jenkins.pipeline.stages

class JenkinsPipeline {

    def csScriptContext

    JenkinsPipeline(def csScriptContext) {
        this.csScriptContext = csScriptContext
    }

    def call() {
        println("Building the project")
    }

//    def void build(def constext) {
//        println("Building the project")
//    }

}