def mygit(repo)
{
  git"${repo}"
}
def mybuild()
{
  sh 'mvn package'
}
def mydeploy()
{
  sh 'scp /home/ubuntu/.jenkins/workspace/"${name}"/webapp/target/webapp.war ubuntu@i"${ip}":/var/lib/tomcat9/webapps/"${context}"'
