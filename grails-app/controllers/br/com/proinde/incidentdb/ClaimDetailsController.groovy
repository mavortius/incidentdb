package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ClaimDetailsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ClaimDetailsController() {
        super(ClaimDetails)
    }
}
