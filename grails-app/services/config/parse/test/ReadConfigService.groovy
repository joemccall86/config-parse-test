package config.parse.test

import grails.core.support.GrailsConfigurationAware
import grails.config.Config
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.transform.Immutable

@CompileStatic
class ReadConfigService implements GrailsConfigurationAware {

    String value1
    String value2

    @Override
    @CompileDynamic
    void setConfiguration(Config co) {
        value1 = co.getProperty('myApp.value')
        value2 = co.myApp.value
    }

    def serviceMethod() {

        assert value1 == value2

        println "serviceMethod called"
    }
}