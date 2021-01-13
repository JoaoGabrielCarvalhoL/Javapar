package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class States extends GenericDomain
{
	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String nameStates;
	
	@Column(nullable = false, length = 2)
	private String acronymStates;
	
	
	public String getNameStates()
	{
		return nameStates;
	}
	
	public void setNameStates(String nameStates)
	{
		this.nameStates = nameStates;
	}
	
}
