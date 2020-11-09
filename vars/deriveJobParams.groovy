def call() {
    properties([
        parameters([
            booleanParam(defaultValue: false, name: 'BuildAll', description: ''),
            [$class: 'ChoiceParameter', choiceType: 'PT_CHECKBOX',
                description: 'Choose environment category.',
                name: 'ENVIRONMENT',
                script: [
                    $class: 'GroovyScript',
                    script: [sandbox: true, script: 'return ["QA", "DEV", "PROD"]']
                ]
            ]
        ])
    ])
}
