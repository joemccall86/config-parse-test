package config.parse.test

import groovy.transform.CompileStatic

@CompileStatic
class ReadConfigController {

    ReadConfigService readConfigService

    def index() {
        readConfigService.serviceMethod()
    }
}
