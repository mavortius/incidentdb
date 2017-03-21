package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class ClubController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ClubController() {
        super(Club)
    }
}
