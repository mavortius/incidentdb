package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class PortController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PortController() {
        super(Port)
    }
}
