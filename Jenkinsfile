node{
    
    stage('code checkout'){
        echo 'checking out the code from git repo'
        git 'https://github.com/shubhamkushwah123/war-test.git'
    }
    
    stage('code build'){
        echo 'build includes.. clean... compile... test... package...'
        sh 'mvn clean package'
    }
    
    stage('code deploy'){
        echo 'deploying war file to tomcat server...'
        deploy adapters: [tomcat9(credentialsId: 'tomcat-creds', path: '', url: 'http://34.238.119.131:8080/')], contextPath: 'war-test', war: '**/*.war'
    }
}
