def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git" 
}

def mavenbuild()
{
    sh 'mvn package'
}

def tomcatDeploy(jobname,ip,appname)
{
    sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war  ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
