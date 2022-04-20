def mylab(repo)
{
git "${repo}"
}
def mybuild()
{
sh 'mvn package'
}
def mydeploy(jobname,ip,name)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${name}"
}
def mytest()
{
  sh 'java -jar testing.jar'
}
