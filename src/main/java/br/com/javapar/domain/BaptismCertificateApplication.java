package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BaptismCertificateApplication extends GenericDomain 
{
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	@JoinColumn(nullable = false)
	private Faithfull requester;
	
	@ManyToMany
	@JoinColumn(nullable = false)
	private BaptismCertificate baptismCertificate; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date deliveryDate;
	
	public BaptismCertificateApplication()
	{
		
	}

	public BaptismCertificateApplication(Faithfull requester, 
			BaptismCertificate baptismCertificate, Date requestDate,
			Date deliveryDate) 
	{
		super();
		this.requester = requester;
		this.baptismCertificate = baptismCertificate;
		this.requestDate = requestDate;
		this.deliveryDate = deliveryDate;
	}

	public Faithfull getRequester() 
	{
		return requester;
	}

	public void setRequester(Faithfull requester) 
	{
		this.requester = requester;
	}

	public BaptismCertificate getBaptismCertificate() 
	{
		return baptismCertificate;
	}

	public void setBaptismCertificate(BaptismCertificate baptismCertificate) 
	{
		this.baptismCertificate = baptismCertificate;
	}

	public Date getRequestDate() 
	{
		return requestDate;
	}

	public void setRequestDate(Date requestDate) 
	{
		this.requestDate = requestDate;
	}

	public Date getDeliveryDate() 
	{
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate)
	{
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() 
	{
		return "BaptismCertificateApplication [requester=" + requester + ", "
				+ "baptismCertificate=" + baptismCertificate+ ", requestDate=" + 
				requestDate + ", deliveryDate=" + deliveryDate + "]";
	}
	
}
