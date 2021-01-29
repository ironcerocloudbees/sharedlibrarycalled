def call() {
  String replyClassName = "org.jenkinsci.plugins.workflow.cps.replay.ReplayCause"
  currentBuild.rawBuild.getCauses().any{ 
    cause -> cause.toString().contains(replyClassName) 
  }
}
