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
	def  MVN_CMD="${MVN_PATH}/bin"
	echo "it is ${MVN_CMD}/bin/mvn"
	bat "cd ${MVN_CMD}"
	bat "mvn clean install"
    } 
    
}
