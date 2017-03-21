package br.com.proinde.incidentdb

class LossCause {
    String name

    static constraints = {
        name blank: false, maxSize: 80, unique: true
    }

    @Override
    String toString() {
        return name
    }
}