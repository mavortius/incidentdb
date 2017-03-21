package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ReporterController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ReporterController() {
        super(Reporter)
    }
}
