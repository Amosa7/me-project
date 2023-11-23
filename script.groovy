def BuildJar() {
    echo "Building Jar of the Application"
}

def Testing() {
    echo "Testing the Application"
}

def DeployJAr() {
    echo "Deploying the application on $ENV"
    echo "Deploying the application version of $VERSION"
}

return this
