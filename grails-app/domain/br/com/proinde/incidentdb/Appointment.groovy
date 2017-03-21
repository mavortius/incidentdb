package br.com.proinde.incidentdb

class Appointment {
    Date appointmentDate
    Date surveyDate
    Date preliminaryDate
    Date reportDate
    Boolean invoiceProinde
    BigDecimal invoiceValue
    Date sendDate
    Date chasingDate
    Date receiptDate
    InvoiceStatus invoiceStatus
    Consultant consultant
    User creationUser
    Date dateCreated
    Date lastUpdated
    User updateUser
    Incident incident

    static mapping = {
        appointmentDate sqlType: 'date'
        surveyDate sqlType: 'date'
        preliminaryDate sqlType: 'date'
        reportDate sqlType: 'date'
        invoiceValue sqlType: 'money'
        sendDate sqlType: 'date'
        chasingDate sqlType: 'date'
        receiptDate sqlType: 'date'
    }

    static constraints = {
        appointmentDate nullable: true
        surveyDate nullable: true
        preliminaryDate nullable: true
        reportDate nullable: true
        invoiceValue nullable: true
        sendDate nullable: true
        chasingDate nullable: true
        receiptDate nullable: true
        invoiceStatus maxSize: 80, inList: InvoiceStatus.values() as List
        updateUser nullable: true
    }

    enum InvoiceStatus {
        NOT_PRESENTED("Not Presented"),
        OUTSTANDING("Outstanding"),
        SETTLED("Settled")

        String label

        InvoiceStatus(String label) {
            this.label = label
        }

        @Override
        String toString() {
            return label
        }
    }
}
