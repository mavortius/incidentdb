package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class LossTypeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    LossTypeController() {
        super(LossType)
    }
}
