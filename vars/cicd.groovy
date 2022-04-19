def git(repo)
{
git "${repo}"
}
def mvn()
{
sh 'mvn package'
}
