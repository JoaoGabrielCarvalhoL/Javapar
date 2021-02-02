package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class WeddingWitnesses extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String witnessName;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(nullable = false, length = 14)
	private String cpf;
	
	@Column(nullable = false, length = 12)
	private String rg; 
	
	@Column(nullable = false, length = 20)
	private String profession;
	
	@Column(nullable = false,length = 20)
	private String maritalStatus;
	
	@Column(nullable = false, length = 20)
	private String nationality;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(nullable = true, length = 14)
	private String telephone;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private City city; 
	
	public WeddingWitnesses()
	{
		
	}

	public WeddingWitnesses(String witnessName, Date dateOfBirth, String cpf, 
			String rg, String profession, String maritalStatus,
			String nationality, String address, String telephone, City city) 
	{
		super();
		this.witnessName = witnessName;
		this.dateOfBirth = dateOfBirth;
		this.cpf = cpf;
		this.rg = rg;
		this.profession = profession;
		this.maritalStatus = maritalStatus;
		this.nationality = nationality;
		this.address = address;
		this.telephone = telephone;
		this.city = city;
	}

	public String getWitnessName() 
	{
		return witnessName;
	}

	public void setWitnessName(String witnessName) 
	{
		this.witnessName = witnessName;
	}

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
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

	public String getProfession() 
	{
		return profession;
	}

	public void setProfession(String profession) 
	{
		this.profession = profession;
	}

	public String getMaritalStatus() 
	{
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) 
	{
		this.maritalStatus = maritalStatus;
	}

	public String getNationality() 
	{
		return nationality;
	}

	public void setNationality(String nationality) 
	{
		this.nationality = nationality;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getTelephone() 
	{
		return telephone;
	}

	public void setTelephone(String telephone) 
	{
		this.telephone = telephone;
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
		return "WeddingWitnesses [witnessName=" + witnessName + ", dateOfBirth=" + 
	dateOfBirth + ", cpf=" + cpf + ", rg=" + rg + ", profession=" + profession + 
	", maritalStatus=" + maritalStatus + ", nationality=" + nationality + 
	", address=" + address + ", telephone=" + telephone + ", city=" + city + "]";
		
	}
	
	
	

}
