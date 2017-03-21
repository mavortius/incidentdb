package br.com.proinde.incidentdb

class CargoInformation {
    String description
    String billOfLadingNumber
    String containerNumber
    CargoType cargoType
    User creationUser
    Date dateCreated
    Date lastUpdated
    User updateUser

    static hasMany = [shippers: Trader, loadingPorts: Port, receivers: Trader, discargePorts: Port]

    static belongsTo = [incident: Incident]

    static mapping = {
        id column: 'incident_id', generator: 'foreign', params: [ property: 'incident' ]
        incident column: 'incident_id', insertable: false, updateable: false
    }

    static constraints = {
        description nullable: true, maxSize: 1024
        billOfLadingNumber nullable: true
        containerNumber nullable: true
        lastUpdated nullable: true
        updateUser nullable: true
    }
}
