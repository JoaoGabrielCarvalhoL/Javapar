package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Administrator extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn
	private Person administrator;
	
	@Column(length=18, nullable = false)
	private String cnpj;
	
	@Column(length=20, nullable = false)
	private String stateRegistration; 
	
	@Column(length=50, nullable = false)
	private String fantasyName;

	public Person getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Person administrator) {
		this.administrator = administrator;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getStateRegistration() {
		return stateRegistration;
	}

	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	@Override
	public String toString() 
	{
		return "Administrator [administrator=" + administrator + ", cnpj=" + cnpj + 
				", stateRegistration=" + stateRegistration + ", fantasyName=" + 
				fantasyName + "]";
	}
	
	
}
