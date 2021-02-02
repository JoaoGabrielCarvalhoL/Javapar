package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class WeddingCertificate extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String groomName;
	
	@Column(nullable = false, length = 50)
	private String brideName;
	
	@Column(nullable = false, length = 50)
	private String parishMarried;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date weddingDate;
	
	public WeddingCertificate()
	{
		
	}

	public WeddingCertificate(String groomName, String brideName, String parishMarried, 
			Date weddingDate) 
	{
		super();
		this.groomName = groomName;
		this.brideName = brideName;
		this.parishMarried = parishMarried;
		this.weddingDate = weddingDate;
	}

	public String getGroomName() 
	{
		return groomName;
	}

	public void setGroomName(String groomName) 
	{
		this.groomName = groomName;
	}

	public String getBrideName() 
	{
		return brideName;
	}

	public void setBrideName(String brideName) 
	{
		this.brideName = brideName;
	}

	public String getParishMarried() 
	{
		return parishMarried;
	}

	public void setParishMarried(String parishMarried) 
	{
		this.parishMarried = parishMarried;
	}

	public Date getWeddingDate() 
	{
		return weddingDate;
	}

	public void setWeddingDate(Date weddingDate) 
	{
		this.weddingDate = weddingDate;
	}

	@Override
	public String toString() 
	{
		return "WeddingCertificate [groomName=" + groomName + ", brideName=" + 
	brideName + ", parishMarried=" + parishMarried + ", weddingDate=" + 
				weddingDate + "]";
	}
	
	

}
