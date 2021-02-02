package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ConfirmationCertificate extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String namePersonConfirmed;
	
	@Column(nullable = true, length = 50)
	private String fatherName; 
	
	@Column(nullable = false, length = 50)
	private String motherName; 
	
	@Column(nullable = true, length = 50)
	private String godfatherName;
	
	@Column(nullable = true, length = 50)
	private String godmotherName; 
	
	@Column(nullable = false, length = 50)
	private String parish;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date confirmationDay;
	
	public ConfirmationCertificate()
	{
		
	}

	public ConfirmationCertificate(String namePersonConfirmed, String fatherName, 
			String motherName, String godfatherName, String godmotherName, 
			String parish, Date confirmationDay) 
	{
		super();
		this.namePersonConfirmed = namePersonConfirmed;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.godfatherName = godfatherName;
		this.godmotherName = godmotherName;
		this.parish = parish;
		this.confirmationDay = confirmationDay;
	}

	public String getNamePersonConfirmed() 
	{
		return namePersonConfirmed;
	}

	public void setNamePersonConfirmed(String namePersonConfirmed) 
	{
		this.namePersonConfirmed = namePersonConfirmed;
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

	public Date getConfirmationDay() 
	{
		return confirmationDay;
	}

	public void setConfirmationDay(Date confirmationDay) 
	{
		this.confirmationDay = confirmationDay;
	}

	@Override
	public String toString() 
	{
		return "ConfirmationCertificate [namePersonConfirmed=" + namePersonConfirmed + 
				", fatherName=" + fatherName + ", motherName=" + motherName + 
				", godfatherName=" + godfatherName + ", godmotherName=" + 
				godmotherName + ", parish=" + parish + ", confirmationDay=" + 
				confirmationDay + "]";
	}
	
	
	

}
