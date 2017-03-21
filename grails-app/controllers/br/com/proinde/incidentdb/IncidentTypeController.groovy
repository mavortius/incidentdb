package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class IncidentTypeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    IncidentTypeController() {
        super(IncidentType)
    }
}
