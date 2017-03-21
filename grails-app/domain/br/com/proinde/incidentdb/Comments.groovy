package br.com.proinde.incidentdb

class Comments {
    String subject
    String commentText
    User creationUser
    Date dateCreated
    Date lastUpdated
    User updateUser

    static belongsTo = [incident: Incident]

    static mapping = {
        id column: 'incident_id', generator: 'foreign', params: [ property: 'incident' ]
        incident column: 'incident_id', insertable: false, updateable: false
        commentText sqlType: 'varchar(max)'
    }

    static constraints = {
        subject maxSize: 100
        updateUser nullable: true
    }
}
