package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class City extends GenericDomain 
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String cityName;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private States states;

	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public States getStates() 
	{
		return states;
	}

	public void setStates(States states) 
	{
		this.states = states;
	}
	
	
	
	
}
