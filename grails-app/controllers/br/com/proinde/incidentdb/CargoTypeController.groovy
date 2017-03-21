package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class CargoTypeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CargoTypeController() {
        super(CargoType)
    }
}
