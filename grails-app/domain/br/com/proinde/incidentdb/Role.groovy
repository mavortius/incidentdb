package br.com.proinde.incidentdb

class Role {
	Authority authority

    static constraints = {
		authority unique: true, maxSize: 50, inList: Authority.values() as List
	}

	enum Authority {
		ROLE_ADMIN("Administrator"),
		ROLE_OPERATOR("Operator"),
		ROLE_READER("Reader")

		String label

		Authority(String label) {
			this.label = label
		}

		@Override
		String toString() {
			return label
		}
	}
}
