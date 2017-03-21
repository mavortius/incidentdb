package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class LossCauseController extends RestfulController {
    static responseFormats = ['json', 'xml']
    LossCauseController() {
        super(LossCause)
    }
}
