package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CatechesisPerson extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String catecheticalPersonName;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthOfDate;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(length = 14, nullable = false)
 	private String cellPhone;
	
	@Column(nullable = false)
	private Boolean isBaptized;
	
	@Column(nullable = true)
	private Boolean communityParticipation;
	
	@Column(nullable = true)
	private Boolean birthCertificate;
	
	@Column(nullable = true)
	private Boolean baptismCertificate;
	
	public CatechesisPerson()
	{
		
	}

	public CatechesisPerson(String catecheticalPersonName, Date birthOfDate, 
			String address, String cellPhone, Boolean isBaptized) 
	{
		super();
		this.catecheticalPersonName = catecheticalPersonName;
		this.birthOfDate = birthOfDate;
		this.address = address;
		this.cellPhone = cellPhone;
		this.isBaptized = isBaptized;
	}

	public CatechesisPerson(String catecheticalPersonName, Date birthOfDate, 
			String address, String cellPhone, Boolean isBaptized, 
			Boolean communityParticipation, Boolean birthCertificate, Boolean baptismCertificate) 
	{
		super();
		this.catecheticalPersonName = catecheticalPersonName;
		this.birthOfDate = birthOfDate;
		this.address = address;
		this.cellPhone = cellPhone;
		this.isBaptized = isBaptized;
		this.communityParticipation = communityParticipation;
		this.birthCertificate = birthCertificate;
		this.baptismCertificate = baptismCertificate;
	}

	public String getCatecheticalPersonName() 
	{
		return catecheticalPersonName;
	}

	public void setCatecheticalPersonName(String catecheticalPersonName) 
	{
		this.catecheticalPersonName = catecheticalPersonName;
	}

	public Date getBirthOfDate() 
	{
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) 
	{
		this.birthOfDate = birthOfDate;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getCellPhone()
	{
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) 
	{
		this.cellPhone = cellPhone;
	}

	public Boolean getIsBaptized() 
	{
		return isBaptized;
	}

	public void setIsBaptized(Boolean isBaptized) 
	{
		this.isBaptized = isBaptized;
	}

	public Boolean getCommunityParticipation() 
	{
		return communityParticipation;
	}

	public void setCommunityParticipation(Boolean communityParticipation) 
	{
		this.communityParticipation = communityParticipation;
	}

	public Boolean getBirthCertificate() 
	{
		return birthCertificate;
	}

	public void setBirthCertificate(Boolean birthCertificate) 
	{
		this.birthCertificate = birthCertificate;
	}

	public Boolean getBaptismCertificate()
	{
		return baptismCertificate;
	}

	public void setBaptismCertificate(Boolean baptismCertificate) 
	{
		this.baptismCertificate = baptismCertificate;
	}

	@Override
	public String toString() 
	{
		return "CatechesisPerson [catecheticalPersonName=" + catecheticalPersonName + 
				", birthOfDate=" + birthOfDate + ", address=" + address + 
				", cellPhone=" + cellPhone + ", isBaptized=" + isBaptized + 
				", communityParticipation=" + communityParticipation + 
				", birthCertificate=" + birthCertificate + ", baptismCertificate=" + 
				baptismCertificate + "]";
	}

}
