def myrepo(repo)
{
  git "${repo}"
}
def mybuild()
{
  sh 'mvn package'
}
def mydeploy(name,ip,file)
{
  "sh scp /home/ubuntu/.jenkins/workspace/${name}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${file}"
}
def mytest()
{
  sh 'java -jar testing.jar'
}
