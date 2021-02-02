package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Person user; 
	
	@Column(nullable = false, length = 32)
	private String password;

	public Person getUser() 
	{
		return user;
	}

	public void setUser(Person user) 
	{
		this.user = user;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	} 

}
