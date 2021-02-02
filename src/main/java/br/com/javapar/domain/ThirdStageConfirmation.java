package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ThirdStageConfirmation extends GenericDomain
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
	
	@Column(nullable = true, length = 50)
	private String godparents; 
	
	@Column(nullable = true)
	private Boolean baptism;
	
	public ThirdStageConfirmation()
	{
		
	}

	public ThirdStageConfirmation(CatechesisPerson adultCatechesis, String weekday, 
			Date hourlyCatechism, String catechistName) 
	{
		super();
		this.adultCatechesis = adultCatechesis;
		this.weekday = weekday;
		this.hourlyCatechism = hourlyCatechism;
		this.catechistName = catechistName;
	}

	public ThirdStageConfirmation(CatechesisPerson adultCatechesis, String weekday, 
			Date hourlyCatechism, String catechistName, String godparents, 
			Boolean baptism) 
	{
		super();
		this.adultCatechesis = adultCatechesis;
		this.weekday = weekday;
		this.hourlyCatechism = hourlyCatechism;
		this.catechistName = catechistName;
		this.godparents = godparents;
		this.baptism = baptism;
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

	public String getGodparents() 
	{
		return godparents;
	}

	public void setGodparents(String godparents) 
	{
		this.godparents = godparents;
	}

	public Boolean getBaptism() 
	{
		return baptism;
	}

	public void setBaptism(Boolean baptism) 
	{
		this.baptism = baptism;
	}

	@Override
	public String toString()
	{
		return "ThirdStageEucharist [adultCatechesis=" + adultCatechesis + 
				", weekday=" + weekday + ", hourlyCatechism=" + hourlyCatechism + 
				", catechistName=" + catechistName + ", godparents=" + godparents + 
				", baptism=" + baptism + "]";
	}

	
}
