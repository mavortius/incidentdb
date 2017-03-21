package br.com.proinde.incidentdb

class ClaimDetails {
    Date receivedDate
    Date completeDate
    BigDecimal amount
    BigDecimal settlementAmount
    String description
    Currency currency
    Currency settlementCurrency
    LossType lossType
    LossCause lossCause
    User creationUser
    Date dateCreated
    Date lastUpdated
    User updateUser

    static belongsTo = [incident: Incident]

    static hasMany = [claimDetailsClaimants: ClaimDetailsClaimant]

    static mapping = {
        id column: 'incident_id', generator: 'foreign', params: [ property: 'incident' ]
        incident column: 'incident_id', insertable: false, updateable: false
        receivedDate sqlType: 'date'
        completeDate sqlType: 'date'
        amount sqlType: "money"
        settlementAmount sqlType: "money"
    }

    static constraints = {
        amount nullable: true
        settlementAmount nullable: true
        receivedDate nullable: true
        completeDate nullable: true
        description maxSize: 1024, nullable: true
        updateUser nullable: true
    }
}
