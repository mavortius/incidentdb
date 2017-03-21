package br.com.proinde.incidentdb

class IncidentClub {
    String clubReference
    Club club

    static belongsTo = [incident: Incident]

    static constraints = {
        clubReference nullable: true, maxSize: 30
    }
}
