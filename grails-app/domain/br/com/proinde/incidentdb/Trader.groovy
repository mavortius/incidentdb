package br.com.proinde.incidentdb

class Trader {
    String name

    static belongsTo = CargoInformation

    static hasMany = [cargoInformations: CargoInformation]

    static constraints = {
        name blank: false, maxSize: 80, unique: true
    }

    @Override
    String toString() {
        return name
    }
}