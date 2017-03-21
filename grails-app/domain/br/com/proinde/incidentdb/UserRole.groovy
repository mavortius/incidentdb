package br.com.proinde.incidentdb

class UserRole implements Serializable {

	User user
	Role role

	static constraints = {
		role validator: { Role r, UserRole ur ->
			if (ur.user == null || ur.user.id == null) return
			boolean existing = false
			UserRole.withNewSession {
				existing = UserRole.exists(ur.user.id, r.id)
			}
			if (existing) {
				return 'userRole.exists'
			}
		}
	}

	static mapping = {
		id composite: ['user', 'role']
	}
}
