package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ClaimHandlerController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ClaimHandlerController() {
        super(ClaimHandler)
    }
}
