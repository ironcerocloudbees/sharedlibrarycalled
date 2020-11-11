def call() {
    properties([
        parameters([
            booleanParam(defaultValue: false, name: 'BuildAll', description: ''),
            booleanParam(defaultValue: false, name: 'parameter1', description: ''),
            choice(choices: ['environment1','environment2','environment3'], description: 'Which destination(s)?', name: 'environment')
        ])
    ])
}
