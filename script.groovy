def buildApp() {
    echo 'Groovy script building the app..'
}

def deployApp() {
    echo "Groovy script deploying version ${params.VERSION}.."
}

return this