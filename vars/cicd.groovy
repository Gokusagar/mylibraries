def mygit(repo)
{
  git "${repo}"
}
def mybuild()
{
  sh 'mvn package'
}
