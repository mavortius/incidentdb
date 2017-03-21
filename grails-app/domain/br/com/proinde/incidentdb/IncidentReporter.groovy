package br.com.proinde.incidentdb

class IncidentReporter {
    Date reportingDate
    Reporter reporter

    static belongsTo = [incident: Incident]

    static mapping = {
        reportingDate sqlType: 'date'
    }
}
