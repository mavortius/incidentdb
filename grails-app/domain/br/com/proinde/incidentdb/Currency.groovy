package br.com.proinde.incidentdb

class Currency {
    String name
    String cultureName

    static constraints = {
        name blank: false, maxSize: 20
        cultureName blank: false, maxSize: 15, unique: true
    }
}
