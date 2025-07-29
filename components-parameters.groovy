#!/usr/bin/env groovy

def getPodComponents() {
    return [
        'app': [
            'websdk', 'koreserver', 'builderx', 'botbuilderframe', 'botstore',
            'entadmin', 'accounts', 'webforms', 'workflows',
            'auth', 'staticui', 'appstore', 'platform', 'koresales', 'searchassistui', 'xowebclient'
        ],
        'consumers': [
            'koreserver'  // Only the main component needed for consumers pod
        ],
        'saapp': [
            'agentassistangular-sdk-v3', 'xocm-ui',
            'agentassist-conf-frame', 'desktop-xo-frame', 'smartassist-xo-frame', 'smartassist-web', 'koreserver'  // Only the main components needed for sapp pod
        ],
        'botmodeller': [
            'botmodeller'
        ],
        'jumpbox': [
            'koreserver', 'machinelearning', 'xoccservice', 'findlykoreserver', 'findly'
        ],
        'search-node': [
            'findlykoreserver'
        ],    
        'search-python': [
            'findly'
        ],
        'search-python-markdown': [
            'findly'
        ],
        'search-nginx': [
            'findlykoreserver',
            'searchassistui'
        ],    
        'xocc-service': [
            'xoccservice'
        ],
        'xocm-service': [
            'xocmservice'
        ],
        'xoqm-service': [
            'xoqmservice'
        ],
        'callflow-runtime': [
            'koreserver'
        ],
        'saintegrations': [
            'saintegrations'
        ],
        'agentai-service': [
            'agentaiservice'
        ],
        'summarization': [
            'summarization'
        ],
        'faq': [
            'faq'
        ],
        'ml': [
            'machinelearning'
        ],
        'ml-embeddings': [
            'machinelearning'
        ],
        'ml-lemmatizer': [
            'machinelearning'
        ],
        'ml-tonalyzer': [
            'machinelearning'
        ],
        'ml-trainer': [
            'machinelearning'
        ],
        'nlp': [
            'chatscriptenglish'
        ],
        'nlp-regression': [
            'chatscriptregression'
        ],
        'nlp-multilang': [
            'chatscriptmultilang'
        ],
        'nlp-french': [
            'chatscriptfrench'
        ],
        'nlp-german': [
            'chatscriptgerman'
        ],
        'searchai-tika-service': [
            ''
        ],
        'searchai-airbyte-service': [
            ''
        ],
        'nlp-spanish': [
            'chatscriptspanish'
        ],
        'agent-coachingai': [
            'agent-coaching-ai'
        ],
        'agent-coachingmodel': [
            'agent-coaching-model'
        ],
        'agent-coachingbackend': [
            'agent-coaching-backend'
        ],
        'campaignmanagement-service': [
            'koreserver'
        ],
        'customerengagement-service': [
            'koreserver'
        ],
        'campaignruntime-service': [
            'xoccservice'
        ],
   
        'logrotate': [
            ''
        ]
    ]
}


def getPodsForComponent(String component) {
    def pods = []
    def components = getPodComponents()
    components.each { pod, compList ->
        if (compList.contains(component)) {
            pods << pod
        }
    }
    return pods
}
return this 
