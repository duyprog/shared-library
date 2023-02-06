def call(branch, url) {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: branch]],
        userRemoteConfigs: [[url: url]]
    ])
}