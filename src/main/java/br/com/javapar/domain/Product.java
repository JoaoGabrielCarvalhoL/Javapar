package br.com.javapar.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Product extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String description;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal price; 
	
	public Product()
	{
		
	}

	public Product(String description, BigDecimal price) 
	{
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public BigDecimal getPrice() 
	{
		return price;
	}

	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Services [description=" + description + ", price=" + price + "]";
	}
	
	
	
	

}
