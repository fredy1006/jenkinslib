package org.devops

//构建类型

def Build(buildType,buildShell){
  def buildTools =  ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
  println("当前的构建类型为${buildType}")
  buildHome= tool buildTools[buildType]
  println("当前构建类型HOME目录为${buildHome}")

  sh "${buildHome}/bin/${buildType} ${buildShell}"
}
