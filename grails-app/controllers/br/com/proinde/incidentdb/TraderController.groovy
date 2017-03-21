package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class TraderController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TraderController() {
        super(Trader)
    }
}
