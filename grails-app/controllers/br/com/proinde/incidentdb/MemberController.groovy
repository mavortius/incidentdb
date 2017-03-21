package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class MemberController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MemberController() {
        super(Member)
    }
}
