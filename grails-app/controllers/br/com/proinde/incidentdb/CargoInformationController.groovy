package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class CargoInformationController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CargoInformationController() {
        super(CargoInformation)
    }
}
