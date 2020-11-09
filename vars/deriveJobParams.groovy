def call() {
    properties([
        parameters([
            booleanParam(defaultValue: false, name: 'BuildAll', description: '')
        ])
    ])
}
