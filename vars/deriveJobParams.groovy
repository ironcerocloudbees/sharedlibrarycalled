def call() {
    properties([
        parameters([
            booleanParam(defaultValue: false, name: 'BuildAll', description: ''),
            booleanParam(defaultValue: false, name: 'parameter1', description: '')
        ])
    ])
}
