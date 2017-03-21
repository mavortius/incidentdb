package br.com.proinde.incidentdb

class ClaimHandler {
    String code
    String name
    String email

    static constraints = {
        code blank: false, maxSize: 4, unique: true
        name blank: false, maxSize: 80, unique: true
        email email: true, nullable: true, maxSize: 20
    }

    @Override
    String toString() {
        return name
    }
}
