package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MarriageCertificateApplication extends GenericDomain 
{
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	@JoinColumn(nullable = false)
	private Faithfull requester;
	
	@ManyToMany
	@JoinColumn(nullable = false)
	private WeddingCertificate weddingCertificate; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date deliveryDate;
	
	public MarriageCertificateApplication()
	{
		
	}

	public MarriageCertificateApplication(Faithfull requester, 
			WeddingCertificate weddingCertificate, Date requestDate, Date deliveryDate) 
	{
		super();
		this.requester = requester;
		this.weddingCertificate = weddingCertificate;
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

	public WeddingCertificate getWeddingCertificate() 
	{
		return weddingCertificate;
	}

	public void setWeddingCertificate(WeddingCertificate weddingCertificate) 
	{
		this.weddingCertificate = weddingCertificate;
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
		return "MarriageCertificateApplication [requester=" + requester + 
				", weddingCertificate=" + weddingCertificate + ", requestDate=" + 
				requestDate + ", deliveryDate=" + deliveryDate + "]";
	}
	
}
