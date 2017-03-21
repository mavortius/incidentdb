package br.com.proinde.incidentdb

class User {
	String username
	String password
	String fullName
	String email
	boolean enabled = true

	static constraints = {
		username blank: false, unique: true, maxSize: 20
		password blank: false
		fullName blank: false, maxSize: 50
		email email: true, nullable: true, maxSize: 20
	}

	static mapping = {
		table '`user`'
		username column: '`username`'
		password column: '`password`'
	}
}
