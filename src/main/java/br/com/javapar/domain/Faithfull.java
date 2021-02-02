package br.com.javapar.domain;

import javax.persistence.Column;

public class Faithfull extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameFaithfull; 
	
	@Column(nullable = false, length = 50)
	private String addressFaithfull;
	
	@Column(nullable = false, length = 14)
	private String cellPhone;
	
	public Faithfull()
	{
		
	}
	
	public Faithfull(String nameFaithfull, String addressFaithfull, String cellPhone)
	{
		this.nameFaithfull = nameFaithfull; 
		this.addressFaithfull = addressFaithfull;
		this.cellPhone = cellPhone;
	}
	
	public String getNameFaithfull()
	{
		return nameFaithfull;
	}
	
	public void setnameFaithfull(String nameFaithfull)
	{
		this.nameFaithfull = nameFaithfull;
	}
	
	public String getAddressFaithfull()
	{
		return addressFaithfull;
	}
	
	public void setAddressFaithfull(String addressFaithfull)
	{
		this.addressFaithfull = addressFaithfull;
	}
	
	public String getCellPhone()
	{
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "Faithfull [nameFaithfull=" + nameFaithfull + ", addressFaithfull=" + 
	addressFaithfull + ", CellPhone=" + cellPhone +"]";
	}
	
	
}
