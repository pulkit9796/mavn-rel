#!/bin/bash
node() {
    
    stage('Build') {
    echo 'yey11'
        
        
    }
    stage('Build22') {
    checkout scm
    bat label: '', script: 'echo \"Hello World\"'   
    }
	stage(mvn_stage) {
	def MVN_PATH=tool name: 'mvn_tool', type: 'maven'
	
	echo "it is ${MVN_PATH}"
    }
}