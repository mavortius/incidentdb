package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ClaimantController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ClaimantController() {
        super(Claimant)
    }
}
