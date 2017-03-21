package br.com.proinde.incidentdb

class Agent {
    String name

    static constraints = {
        name blank: false, maxSize: 80, unique: true
    }

    @Override
    String toString() {
        return name
    }
}
