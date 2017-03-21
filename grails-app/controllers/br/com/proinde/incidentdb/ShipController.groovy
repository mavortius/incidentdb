package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ShipController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ShipController() {
        super(Ship)
    }
}
