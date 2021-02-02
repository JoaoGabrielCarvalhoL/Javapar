package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Person extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String name; 
	
	@Column(nullable = false, length = 14)
	private String cpf;
	
	@Column(nullable = false, length = 12)
	private String rg; 
	
	@Column(nullable = false, length = 50)
	private String street; 
	
	@Column(nullable = false, length = 30)
	private String neighborhood;
	
	@Column(nullable = false, length = 10)
	private String zipCode;
	
	@Column(nullable = true, length = 15)
	private String complement;
	
	@Column(nullable = true, length = 13)
	private String telephone;
	
	@Column(nullable = false, length = 14)
	private String cellPhone;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private City city;
	
	public Person()
	{
		
	}

	public Person(String name, String cpf, String rg, String street, 
			String neighborhood, String zipCode,String complement, 
			String telephone, String cellPhone, String email, City city) 
	{
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.street = street;
		this.neighborhood = neighborhood;
		this.zipCode = zipCode;
		this.complement = complement;
		this.telephone = telephone;
		this.cellPhone = cellPhone;
		this.email = email;
		this.city = city;
	}

	public Person(String name, String cpf, String rg, String street, 
			String neighborhood, String zipCode,
			String cellPhone, String email, City city) 
	{
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.street = street;
		this.neighborhood = neighborhood;
		this.zipCode = zipCode;
		this.cellPhone = cellPhone;
		this.email = email;
		this.city = city;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getRg() 
	{
		return rg;
	}

	public void setRg(String rg) 
	{
		this.rg = rg;
	}

	public String getStreet() 
	{
		return street;
	}

	public void setStreet(String street) 
	{
		this.street = street;
	}

	public String getNeighborhood() 
	{
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) 
	{
		this.neighborhood = neighborhood;
	}

	public String getZipCode() 
	{
		return zipCode;
	}

	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}

	public String getComplement() 
	{
		return complement;
	}

	public void setComplement(String complement) 
	{
		this.complement = complement;
	}

	public String getTelephone() 
	{
		return telephone;
	}

	public void setTelephone(String telephone) 
	{
		this.telephone = telephone;
	}

	public String getCellPhone() 
	{
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) 
	{
		this.cellPhone = cellPhone;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public City getCity() 
	{
		return city;
	}

	public void setCity(City city)
	{
		this.city = city;
	}

	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", cpf=" + cpf + ", rg=" + rg + 
				", street=" + street + ", neighborhood=" + neighborhood + 
				", zipCode=" + zipCode + ", complement=" + complement + 
				", telephone=" + telephone + ", cellPhone=" + cellPhone + 
				", email=" + email + ", city=" + city + "]";
	}
	
	
	

}
