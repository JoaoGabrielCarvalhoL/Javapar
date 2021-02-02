package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AdultCatechesis extends GenericDomain
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
	
	@Column(nullable = true)
	private Boolean chrism; 
	
	@Column(nullable = true)
	private Boolean marriage;
	
	public AdultCatechesis()
	{
		
	}

	public AdultCatechesis(CatechesisPerson adultCatechesis, String weekday, 
			Date hourlyCatechism, String catechistName) 
	{
		super();
		this.adultCatechesis = adultCatechesis;
		this.weekday = weekday;
		this.hourlyCatechism = hourlyCatechism;
		this.catechistName = catechistName;
	}

	public AdultCatechesis(CatechesisPerson adultCatechesis, String weekday, 
			Date hourlyCatechism, String catechistName, Boolean baptism, 
			Boolean eucharist, Boolean chrism, Boolean marriage) 
	{
		super();
		this.adultCatechesis = adultCatechesis;
		this.weekday = weekday;
		this.hourlyCatechism = hourlyCatechism;
		this.catechistName = catechistName;
		this.baptism = baptism;
		this.eucharist = eucharist;
		this.chrism = chrism;
		this.marriage = marriage;
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

	public Boolean getChrism() 
	{
		return chrism;
	}

	public void setChrism(Boolean chrism) 
	{
		this.chrism = chrism;
	}

	public Boolean getMarriage() 
	{
		return marriage;
	}

	public void setMarriage(Boolean marriage) 
	{
		this.marriage = marriage;
	}

	@Override
	public String toString() 
	{
		return "AdultCatechesis [adultCatechesis=" + adultCatechesis + ", weekday=" + 
	weekday + ", hourlyCatechism=" + hourlyCatechism + ", catechistName=" + 
				catechistName + ", baptism=" + baptism + ", eucharist=" + 
	eucharist + ", chrism=" + chrism + ", marriage=" + marriage + "]";
		
	}
	
}
