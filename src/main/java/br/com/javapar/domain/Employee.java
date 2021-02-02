package br.com.javapar.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date admissionDate;
	
	@Column(nullable = false, length = 15)
	private String workCard;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateBirth; 
	
	@Column(nullable = false, length = 30)
	private String occupation;
		
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal salary;
	
	@Column(nullable = false, length = 50)
	private String workplace;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;
	
	public Employee()
	{
		
	}

	public Employee(Date admissionDate, String workCard, Date dateBirth, 
			String occupation, BigDecimal salary, String workplace, Person person) 
	{
		super();
		this.admissionDate = admissionDate;
		this.workCard = workCard;
		this.dateBirth = dateBirth;
		this.occupation = occupation;
		this.salary = salary;
		this.workplace = workplace;
		this.person = person;
	}

	public Date getAdmissionDate() 
	{
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) 
	{
		this.admissionDate = admissionDate;
	}

	public String getWorkCard() 
	{
		return workCard;
	}

	public void setWorkCard(String workCard) 
	{
		this.workCard = workCard;
	}

	public Date getDateBirth() 
	{
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) 
	{
		this.dateBirth = dateBirth;
	}

	public String getOccupation() 
	{
		return occupation;
	}

	public void setOccupation(String occupation) 
	{
		this.occupation = occupation;
	}

	public BigDecimal getSalary() 
	{
		return salary;
	}

	public void setSalary(BigDecimal salary) 
	{
		this.salary = salary;
	}

	public String getWorkplace() 
	{
		return workplace;
	}

	public void setWorkplace(String workplace) 
	{
		this.workplace = workplace;
	}

	public Person getPerson()
	{
		return person;
	}

	public void setPerson(Person person) 
	{
		this.person = person;
	}

	@Override
	public String toString() 
	{
		return "Employee [admissionDate=" + admissionDate + ", workCard=" + 
	workCard + ", dateBirth=" + dateBirth + ", occupation=" + occupation + 
	", salary=" + salary + ", workplace=" + workplace + ", person=" + person + "]";
		
	}
	

}
