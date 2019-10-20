#!/bin/bash
node() {
stage('mmmmmm') {}
   stage('Build') {
    echo 'yey11'
        
        
    }
    stage('Build22') {
    checkout scm
    bat label: '', script: 'echo \"Hello World\"'   
    }
	stage('mvn_stage') {
	def MVN_PATH=tool name: 'mvn_tool', type: 'maven'
	def  MVN_CMD="${MVN_PATH}/bin/mvn"
	echo "it is ${MVN_CMD}/bin/mvn"
	bat "${MVN_CMD} clean install"
    } 
    
}
