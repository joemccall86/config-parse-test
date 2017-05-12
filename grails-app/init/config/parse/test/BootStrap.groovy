package config.parse.test

class BootStrap {

    def readConfigService

    def init = { servletContext ->

        readConfigService.serviceMethod()
    }
    def destroy = {
    }
}
