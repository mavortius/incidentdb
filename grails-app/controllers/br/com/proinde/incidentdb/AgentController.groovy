package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class AgentController extends RestfulController {
    static responseFormats = ['hal', 'json', 'xml']

    AgentController() {
        super(Agent)
    }
}
