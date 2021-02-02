package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class WeddingPerson extends GenericDomain
{
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String weddingNamePerson; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthOfDate;
	
	@Column(nullable = false, length = 14)
	private String cpf;
	
	@Column(nullable = false, length = 12)
	private String rg; 
	
	@Column(nullable = false, length = 50)
	private String street; 
	
	@Column(nullable = false, length = 30)
	private String neighborhood;
		
	@Column(nullable = false, length = 14)
	private String cellPhone;
	
	@Column(nullable = false, length = 20)
	private String profession;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private City city;
	
	public WeddingPerson()
	{
		
	}

	public WeddingPerson(String weddingNamePerson, Date birthOfDate, 
			String cpf, String rg, String street, String neighborhood, 
			String cellPhone, String profession, City city) 
	{
		super();
		this.weddingNamePerson = weddingNamePerson;
		this.birthOfDate = birthOfDate;
		this.cpf = cpf;
		this.rg = rg;
		this.street = street;
		this.neighborhood = neighborhood;
		this.cellPhone = cellPhone;
		this.profession = profession;
		this.city = city;
	}

	public String getWeddingNamePerson() 
	{
		return weddingNamePerson;
	}

	public void setWeddingNamePerson(String weddingNamePerson) 
	{
		this.weddingNamePerson = weddingNamePerson;
	}

	public Date getBirthOfDate() 
	{
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) 
	{
		this.birthOfDate = birthOfDate;
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

	public String getCellPhone() 
	{
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) 
	{
		this.cellPhone = cellPhone;
	}

	public String getProfession() 
	{
		return profession;
	}

	public void setProfession(String profession) 
	{
		this.profession = profession;
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
		return "WeddingPerson [weddingNamePerson=" + weddingNamePerson + 
				", birthOfDate=" + birthOfDate + ", cpf=" + cpf
				+ ", rg=" + rg + ", street=" + street + ", neighborhood=" + 
				neighborhood + ", cellPhone=" + cellPhone
				+ ", profession=" + profession + ", city=" + city + "]";
	}
	
	

}
