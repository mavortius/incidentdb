package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class IncidentController extends RestfulController {
    static responseFormats = ['json', 'xml']

    IncidentController() {
        super(Incident)
    }
}
