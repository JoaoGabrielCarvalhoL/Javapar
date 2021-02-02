package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Services extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String description;

	public Services()
	{
		
	}

	public Services(String description)
	{
		this.description = description;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString() 
	{
		return "Services [description=" + description + "]";
	}
	
}
