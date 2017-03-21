package br.com.proinde.incidentdb

class ClaimDetailsClaimant {
    String claimantReference
    Boolean directlyClaimant
    Claimant claimant

    static belongsTo = [claimDetails: ClaimDetails]

    static constraints = {
        claimantReference nullable: true, maxSize: 30
    }
}
