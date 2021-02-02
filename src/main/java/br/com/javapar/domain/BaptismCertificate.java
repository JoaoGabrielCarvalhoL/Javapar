package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BaptismCertificate extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String baptizedPersonName;
	
	@Column(nullable = true, length = 50)
	private String fatherName; 
	
	@Column(nullable = false, length = 50)
	private String motherName; 
	
	@Column(nullable = false, length = 50)
	private String godfatherName;
	
	@Column(nullable = false, length = 50)
	private String godmotherName; 
	
	@Column(nullable = false, length = 50)
	private String parish;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date baptismDay;
	
	public BaptismCertificate()
	{
		
	}

	public BaptismCertificate(String baptizedPersonName, String fatherName, 
			String motherName, String godfatherName, String godmotherName, String parish, 
			Date baptismDay) 
	{
		super();
		this.baptizedPersonName = baptizedPersonName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.godfatherName = godfatherName;
		this.godmotherName = godmotherName;
		this.parish = parish;
		this.baptismDay = baptismDay;
	}

	public String getBaptizedPersonName() 
	{
		return baptizedPersonName;
	}

	public void setBaptizedPersonName(String baptizedPersonName) 
	{
		this.baptizedPersonName = baptizedPersonName;
	}

	public String getFatherName() 
	{
		return fatherName;
	}

	public void setFatherName(String fatherName) 
	{
		this.fatherName = fatherName;
	}

	public String getMotherName() 
	{
		return motherName;
	}

	public void setMotherName(String motherName) 
	{
		this.motherName = motherName;
	}

	public String getGodfatherName() 
	{
		return godfatherName;
	}

	public void setGodfatherName(String godfatherName) 
	{
		this.godfatherName = godfatherName;
	}

	public String getGodmotherName() 
	{
		return godmotherName;
	}

	public void setGodmotherName(String godmotherName) 
	{
		this.godmotherName = godmotherName;
	}

	public String getParish() 
	{
		return parish;
	}

	public void setParish(String parish) 
	{
		this.parish = parish;
	}

	public Date getBaptismDay() 
	{
		return baptismDay;
	}

	public void setBaptismDay(Date baptismDay) 
	{
		this.baptismDay = baptismDay;
	}

	@Override
	public String toString() 
	{
		return "BaptismCertificate [baptizedPersonName=" + baptizedPersonName + 
				", fatherName=" + fatherName + ", motherName=" + motherName + 
				", godfatherName=" + godfatherName + ", godmotherName=" + 
				godmotherName + ", parish=" + parish + ", baptismDay=" + 
				baptismDay + "]";
	}
	
	

}
