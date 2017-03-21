package br.com.proinde.incidentdb

class Club {
    String name
    String code

    static constraints = {
        name blank: false, maxSize: 80, unique: true
    }

    @Override
    String toString() {
        return name
    }
}
