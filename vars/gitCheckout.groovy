def call(String branchName = "main", String repoUrl = "" ) {
    echo "Checking out ${repoUrl} @ ${branchName}"
    git branch: branchName, url: repoUrl
}
