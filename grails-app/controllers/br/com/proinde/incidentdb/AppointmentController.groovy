package br.com.proinde.incidentdb


import grails.rest.*
import grails.converters.*

class AppointmentController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AppointmentController() {
        super(Appointment)
    }
}
