package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SecondStageConfirmation extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private CatechesisPerson adultCatechesis;
	
	@Column(nullable = false, length = 20)
	private String weekday; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hourlyCatechism;
	
	@Column(nullable = false, length = 50)
	private String catechistName;
	
	@Column(nullable = true)
	private Boolean baptism;
	
	@Column(nullable = true)
	private Boolean eucharist;
	
	public SecondStageConfirmation()
	{
		
	}

	public SecondStageConfirmation(CatechesisPerson adultCatechesis, String weekday, 
			Date hourlyCatechism, String catechistName, Boolean baptism, 
			Boolean eucharist) 
	{
		super();
		this.adultCatechesis = adultCatechesis;
		this.weekday = weekday;
		this.hourlyCatechism = hourlyCatechism;
		this.catechistName = catechistName;
		this.baptism = baptism;
		this.eucharist = eucharist;
	}

	public CatechesisPerson getAdultCatechesis() 
	{
		return adultCatechesis;
	}

	public void setAdultCatechesis(CatechesisPerson adultCatechesis) 
	{
		this.adultCatechesis = adultCatechesis;
	}

	public String getWeekday() 
	{
		return weekday;
	}

	public void setWeekday(String weekday) 
	{
		this.weekday = weekday;
	}

	public Date getHourlyCatechism() 
	{
		return hourlyCatechism;
	}

	public void setHourlyCatechism(Date hourlyCatechism) 
	{
		this.hourlyCatechism = hourlyCatechism;
	}

	public String getCatechistName() 
	{
		return catechistName;
	}

	public void setCatechistName(String catechistName) 
	{
		this.catechistName = catechistName;
	}

	public Boolean getBaptism() 
	{
		return baptism;
	}

	public void setBaptism(Boolean baptism) 
	{
		this.baptism = baptism;
	}
	
	public Boolean getEucharist()
	{
		return eucharist;
	}
	
	public void setEucharist(Boolean eucharist)
	{
		this.eucharist = eucharist;
	}

	@Override
	public String toString() 
	{
		return "FirstStageEucharist [adultCatechesis=" + adultCatechesis + 
				", weekday=" + weekday + ", hourlyCatechism=" + hourlyCatechism + 
				", catechistName=" + catechistName + ", baptism=" + baptism + 
				"eucharist=" + eucharist +"]";
	}
	
}
