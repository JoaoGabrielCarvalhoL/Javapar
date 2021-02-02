package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Marriage extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date weddingData;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date weddingTime;
	
	@Column(nullable = false, length = 30)
	private String parish;
	
	@Column(nullable = false, length = 30)
	private String priestCelebrate;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private WeddingPerson engaged;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private WeddingPerson bride;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private WeddingWitnesses firstWitness;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private WeddingWitnesses secondWitness;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private City city;
	
	@Column(nullable = true)
	private Boolean birthCertificate;
	
	@Column(nullable = true)
	private Boolean generalRecord;
	
	@Column(nullable = true)
	private Boolean physicalPersonCertificate;
	
	@Column(nullable = true)
	private Boolean baptismCertificate;
	
	@Column(nullable = true)
	private Boolean updateBaptismCertificate;
	
	@Column(nullable = true)
	private Boolean civilMarriageCertificate;
	
	@Column(nullable = true)
	private Boolean weddingCourseCertificate;
	
	@Column(nullable = true)
	private Boolean interview;
	
	@Column(nullable = true)
	private Boolean confession;
	
	public Marriage()
	{
		
	}

	public Marriage(Date weddingData, Date weddingTime, String parish, 
			String priestCelebrate, WeddingPerson engaged, WeddingPerson bride, 
			WeddingWitnesses firstWitness, WeddingWitnesses secondWitness, City city)
	{
		super();
		this.weddingData = weddingData;
		this.weddingTime = weddingTime;
		this.parish = parish;
		this.priestCelebrate = priestCelebrate;
		this.engaged = engaged;
		this.bride = bride;
		this.firstWitness = firstWitness;
		this.secondWitness = secondWitness;
		this.city = city;
	}

	public Marriage(Date weddingData, Date weddingTime, String parish, 
			String priestCelebrate, WeddingPerson engaged, WeddingPerson bride, 
			WeddingWitnesses firstWitness, WeddingWitnesses secondWitness, City city,
			Boolean birthCertificate, Boolean generalRecord, 
			Boolean physicalPersonCertificate,Boolean baptismCertificate, 
			Boolean updateBaptismCertificate, Boolean civilMarriageCertificate,
			Boolean weddingCourseCertificate, Boolean interview, Boolean confession) 
	{
		super();
		this.weddingData = weddingData;
		this.weddingTime = weddingTime;
		this.parish = parish;
		this.priestCelebrate = priestCelebrate;
		this.engaged = engaged;
		this.bride = bride;
		this.firstWitness = firstWitness;
		this.secondWitness = secondWitness;
		this.city = city;
		this.birthCertificate = birthCertificate;
		this.generalRecord = generalRecord;
		this.physicalPersonCertificate = physicalPersonCertificate;
		this.baptismCertificate = baptismCertificate;
		this.updateBaptismCertificate = updateBaptismCertificate;
		this.civilMarriageCertificate = civilMarriageCertificate;
		this.weddingCourseCertificate = weddingCourseCertificate;
		this.interview = interview;
		this.confession = confession;
	}

	public Date getWeddingData() 
	{
		return weddingData;
	}

	public void setWeddingData(Date weddingData) 
	{
		this.weddingData = weddingData;
	}

	public Date getWeddingTime() 
	{
		return weddingTime;
	}

	public void setWeddingTime(Date weddingTime)
	{
		this.weddingTime = weddingTime;
	}

	public String getParish() 
	{
		return parish;
	}

	public void setParish(String parish) 
	{
		this.parish = parish;
	}

	public String getPriestCelebrate() 
	{
		return priestCelebrate;
	}

	public void setPriestCelebrate(String priestCelebrate) 
	{
		this.priestCelebrate = priestCelebrate;
	}

	public WeddingPerson getEngaged() 
	{
		return engaged;
	}

	public void setEngaged(WeddingPerson engaged) 
	{
		this.engaged = engaged;
	}

	public WeddingPerson getBride() 
	{
		return bride;
	}

	public void setBride(WeddingPerson bride) 
	{
		this.bride = bride;
	}

	public WeddingWitnesses getFirstWitness() 
	{
		return firstWitness;
	}

	public void setFirstWitness(WeddingWitnesses firstWitness) 
	{
		this.firstWitness = firstWitness;
	}

	public WeddingWitnesses getSecondWitness()
	{
		return secondWitness;
	}

	public void setSecondWitness(WeddingWitnesses secondWitness) 
	{
		this.secondWitness = secondWitness;
	}

	public City getCity() 
	{
		return city;
	}

	public void setCity(City city) 
	{
		this.city = city;
	}

	public Boolean getBirthCertificate() 
	{
		return birthCertificate;
	}

	public void setBirthCertificate(Boolean birthCertificate) 
	{
		this.birthCertificate = birthCertificate;
	}

	public Boolean getGeneralRecord() 
	{
		return generalRecord;
	}

	public void setGeneralRecord(Boolean generalRecord) 
	{
		this.generalRecord = generalRecord;
	}

	public Boolean getPhysicalPersonCertificate() 
	{
		return physicalPersonCertificate;
	}

	public void setPhysicalPersonCertificate(Boolean physicalPersonCertificate) 
	{
		this.physicalPersonCertificate = physicalPersonCertificate;
	}

	public Boolean getBaptismCertificate() 
	{
		return baptismCertificate;
	}

	public void setBaptismCertificate(Boolean baptismCertificate) 
	{
		this.baptismCertificate = baptismCertificate;
	}

	public Boolean getUpdateBaptismCertificate() 
	{
		return updateBaptismCertificate;
	}

	public void setUpdateBaptismCertificate(Boolean updateBaptismCertificate) 
	{
		this.updateBaptismCertificate = updateBaptismCertificate;
	}

	public Boolean getCivilMarriageCertificate() 
	{
		return civilMarriageCertificate;
	}

	public void setCivilMarriageCertificate(Boolean civilMarriageCertificate) 
	{
		this.civilMarriageCertificate = civilMarriageCertificate;
	}

	public Boolean getWeddingCourseCertificate() 
	{
		return weddingCourseCertificate;
	}

	public void setWeddingCourseCertificate(Boolean weddingCourseCertificate) 
	{
		this.weddingCourseCertificate = weddingCourseCertificate;
	}

	public Boolean getInterview() {
		return interview;
	}

	public void setInterview(Boolean interview) {
		this.interview = interview;
	}

	public Boolean getConfession() {
		return confession;
	}

	public void setConfession(Boolean confession) {
		this.confession = confession;
	}

	@Override
	public String toString() 
	{
		return "Marriage [weddingData=" + weddingData + ", weddingTime=" + 
	weddingTime + ", parish=" + parish + ", priestCelebrate=" + priestCelebrate + 
	", engaged=" + engaged + ", bride=" + bride + ", firstWitness=" + firstWitness + 
	", secondWitness=" + secondWitness + ", city=" + city + ", birthCertificate=" + 
	birthCertificate + ", generalRecord=" + generalRecord + 
	", physicalPersonCertificate=" + physicalPersonCertificate + 
	", baptismCertificate=" + baptismCertificate + ", updateBaptismCertificate=" + 
	updateBaptismCertificate+ ", civilMarriageCertificate=" + 
	civilMarriageCertificate + ", weddingCourseCertificate="+ 
	weddingCourseCertificate + ", interview=" + interview + ", confession=" + 
	confession + "]";
		
	}
	
	
	
	

}
