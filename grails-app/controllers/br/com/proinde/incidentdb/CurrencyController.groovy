package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class CurrencyController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CurrencyController() {
        super(Currency)
    }
}
