def mygit(repo)
{
  git "${repo}"
}
def mybuild()
{
  sh 'mvn package'
}
def mydeploy(job,ip,file)
{
  "scp /home/ubuntu/.jenkins/workspace/$job/webapp/target/webapp.war ubuntu@$ip:/var/lib/tomcat9/webapps/$file"
}
def mytest()
{
  sh 'java -jar testing.jar'
}
