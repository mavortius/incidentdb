package br.com.proinde.incidentdb

class Incident {
    IncidentReference reference
    IncidentStatusType status
    Date closingDate
    Ship ship
    String voyageAndLeg
    Date berthingBate
    Date incidentDate
    Club club
    String clubReference
    Member member
    Member owner
    Agent localAgent
    Date timeBarDate
    Port incidentPlace
    IncidentType type
    IncidentType reason
    Boolean claimPresented
    Boolean cargoInvolved
    Date latestReportDate
    Date nextReviewDate
    String description
    ClaimHandler handler
    Date estimatedDisposalDate
    Date effectiveDisposalDate
    User creationUser
    Date dateCreated
    Date lastUpdated
    User updateUser

    static embedded = ['reference']

    static hasMany = [incidentClubs: IncidentClub, incidentReporters: IncidentReporter]

    static hasOne = [claimDetails: ClaimDetails, cargoInformation: CargoInformation, comments: Comments]  

    static constraints = {
        reference unique: true
        voyageAndLeg nullable: true, maxSize: 10
        berthingBate nullable: true
        nextReviewDate nullable: true
        incidentDate nullable: true
        closingDate nullable: true
        clubReference nullable: true
        timeBarDate nullable: true
        reason nullable: true
        latestReportDate nullable: true
        estimatedDisposalDate nullable: true
        effectiveDisposalDate nullable: true
        claimDetails unique: true
        cargoInformation unique: true
        description maxSize: 1024
        claimDetails unique: true
        cargoInformation unique: true
        comments unique: true
        status inList: IncidentStatusType.values() as List
        updateUser nullable: true
    }

    static mapping = {
        incidentDate sqlType: 'date'
        berthingBate sqlType: 'date'
        closingDate sqlType: 'date'
        timeBarDate sqlType: 'date'
        latestReportDate sqlType: 'date'
        estimatedDisposalDate sqlType: 'date'
        nextReviewDate sqlType: 'date'
        effectiveDisposalDate sqlType: 'date'
    }

    enum IncidentStatusType {
        OPEN("Open"),
        CLOSED("Closed"),
        WITHDRAWN("Withdrawn"),
        SETTLED("Settled"),
        OUTSTANDING("Outstanding"),
        REPUDIATED("Repudiated"),
        DISCARDED("Discarded")

        String label

        IncidentStatusType(String label) {
            this.label = label
        }

        @Override
        String toString() {
            return label
        }
    }
}

class IncidentReference {
    Short number
    Short year
    Short subNumber

}


