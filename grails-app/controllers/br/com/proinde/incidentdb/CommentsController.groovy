package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class CommentsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CommentsController() {
        super(Comments)
    }
}
