aws s3 cp s3://aws-code-deploy-bucket-shubhamkushwah123/test-war/war-test.war /tmp
sudo mv /tmp/war-test.war /usr/share/tomcat9/webapps/war-test.war
sudo service tomcat restart
