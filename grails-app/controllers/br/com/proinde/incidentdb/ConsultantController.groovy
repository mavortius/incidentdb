package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ConsultantController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ConsultantController() {
        super(Consultant)
    }
}
