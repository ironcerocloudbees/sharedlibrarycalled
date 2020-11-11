def call() {
    properties([
        parameters([
            choice(choices: 'environment1\nenvironment2\nenvironment3\nenvironment4', description: 'Which destination(s)?', name: 'environment')
        ])
    ])
}
