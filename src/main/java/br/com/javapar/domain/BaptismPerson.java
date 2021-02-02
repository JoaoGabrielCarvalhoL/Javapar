package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BaptismPerson extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameBaptism;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(nullable = false, length = 50)
	private String placeOfBirth; 
	
	@Column(nullable = true, length = 50)
	private String fatherName;
	
	@Column(nullable = true, length = 50)
	private String placeOfBirthFather;
	
	@Column(nullable = true, length = 14)
	private String telephoneFather;
	
	@Column(nullable = false, length = 50)
	private String motherName; 
	
	@Column(nullable = false, length = 50)
	private String placeOfBirthMother;
	
	@Column(nullable = true, length = 14)
	private String telephoneMother;
	
	@Column(nullable = false)
	private Boolean marriedReligious;
	
	@Column(nullable = false)
	private Boolean marriedCivil;
	
	@Column(nullable = false)
	private Boolean baptismCourse;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(nullable = false, length = 50)
	private String godfatherName;
	
	@Column(nullable = false, length = 50)
	private String godmotherName;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date baptismDate;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private City city;
	
	@Column(nullable = true)
	private Boolean birthCertificate;
	
	@Column(nullable = true)
	private Boolean baptismCourseCertificate;
	
	@Column(nullable = true)
	private Boolean godparentsReligiousMarriageCertificate;
	
	@Column(nullable = true)
	private Boolean godparentsCivilMarriageCertificate;
	
	
	
	public BaptismPerson()
	{
		
	}

	public BaptismPerson(String nameBaptism, Date dateOfBirth, String placeOfBirth, 
			String motherName, String placeOfBirthMother, Boolean marriedReligious,
			Boolean marriedCivil, Boolean baptismCourse, String address, 
			String godfatherName, String godmotherName, Date baptismDate, City city) 
	{
		super();
		this.nameBaptism = nameBaptism;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.motherName = motherName;
		this.placeOfBirthMother = placeOfBirthMother;
		this.marriedReligious = marriedReligious;
		this.marriedCivil = marriedCivil;
		this.baptismCourse = baptismCourse;
		this.address = address;
		this.godfatherName = godfatherName;
		this.godmotherName = godmotherName;
		this.baptismDate = baptismDate;
		this.city = city;
	}

	public BaptismPerson(String nameBaptism, Date dateOfBirth, String placeOfBirth, 
			String fatherName, String placeOfBirthFather, String telephoneFather, 
			String motherName, String placeOfBirthMother, String telephoneMother, 
			Boolean marriedReligious, Boolean marriedCivil, Boolean baptismCourse, 
			String address, String godfatherName, String godmotherName, 
			Date baptismDate, City city) 
	{
		super();
		this.nameBaptism = nameBaptism;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.fatherName = fatherName;
		this.placeOfBirthFather = placeOfBirthFather;
		this.telephoneFather = telephoneFather;
		this.motherName = motherName;
		this.placeOfBirthMother = placeOfBirthMother;
		this.telephoneMother = telephoneMother;
		this.marriedReligious = marriedReligious;
		this.marriedCivil = marriedCivil;
		this.baptismCourse = baptismCourse;
		this.address = address;
		this.godfatherName = godfatherName;
		this.godmotherName = godmotherName;
		this.baptismDate = baptismDate;
		this.city = city;
	}

	public BaptismPerson(String nameBaptism, Date dateOfBirth, String placeOfBirth, 
			String fatherName, String placeOfBirthFather, String telephoneFather, 
			String motherName, String placeOfBirthMother, String telephoneMother, 
			Boolean marriedReligious, Boolean marriedCivil, Boolean baptismCourse,
			String address, String godfatherName, String godmotherName, Date baptismDate, 
			City city, Boolean birthCertificate, Boolean baptismCourseCertificate, 
			Boolean godparentsReligiousMarriageCertificate, 
			Boolean godparentsCivilMarriageCertificate) 
	{
		super();
		this.nameBaptism = nameBaptism;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.fatherName = fatherName;
		this.placeOfBirthFather = placeOfBirthFather;
		this.telephoneFather = telephoneFather;
		this.motherName = motherName;
		this.placeOfBirthMother = placeOfBirthMother;
		this.telephoneMother = telephoneMother;
		this.marriedReligious = marriedReligious;
		this.marriedCivil = marriedCivil;
		this.baptismCourse = baptismCourse;
		this.address = address;
		this.godfatherName = godfatherName;
		this.godmotherName = godmotherName;
		this.baptismDate = baptismDate;
		this.city = city;
		this.birthCertificate = birthCertificate;
		this.baptismCourseCertificate = baptismCourseCertificate;
		this.godparentsReligiousMarriageCertificate = godparentsReligiousMarriageCertificate;
		this.godparentsCivilMarriageCertificate = godparentsCivilMarriageCertificate;
	}

	public String getNameBaptism() 
	{
		return nameBaptism;
	}

	public void setNameBaptism(String nameBaptism) 
	{
		this.nameBaptism = nameBaptism;
	}

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() 
	{
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) 
	{
		this.placeOfBirth = placeOfBirth;
	}

	public String getFatherName() 
	{
		return fatherName;
	}

	public void setFatherName(String fatherName) 
	{
		this.fatherName = fatherName;
	}

	public String getPlaceOfBirthFather() 
	{
		return placeOfBirthFather;
	}

	public void setPlaceOfBirthFather(String placeOfBirthFather) 
	{
		this.placeOfBirthFather = placeOfBirthFather;
	}

	public String getTelephoneFather() 
	{
		return telephoneFather;
	}

	public void setTelephoneFather(String telephoneFather) 
	{
		this.telephoneFather = telephoneFather;
	}

	public String getMotherName() 
	{
		return motherName;
	}

	public void setMotherName(String motherName) 
	{
		this.motherName = motherName;
	}

	public String getPlaceOfBirthMother() 
	{
		return placeOfBirthMother;
	}

	public void setPlaceOfBirthMother(String placeOfBirthMother) 
	{
		this.placeOfBirthMother = placeOfBirthMother;
	}

	public String getTelephoneMother() 
	{
		return telephoneMother;
	}

	public void setTelephoneMother(String telephoneMother) 
	{
		this.telephoneMother = telephoneMother;
	}

	public Boolean getMarriedReligious() 
	{
		return marriedReligious;
	}

	public void setMarriedReligious(Boolean marriedReligious) 
	{
		this.marriedReligious = marriedReligious;
	}

	public Boolean getMarriedCivil() 
	{
		return marriedCivil;
	}

	public void setMarriedCivil(Boolean marriedCivil) 
	{
		this.marriedCivil = marriedCivil;
	}

	public Boolean getBaptismCourse() 
	{
		return baptismCourse;
	}

	public void setBaptismCourse(Boolean baptismCourse) 
	{
		this.baptismCourse = baptismCourse;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
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

	public Date getBaptismDate() 
	{
		return baptismDate;
	}

	public void setBaptismDate(Date baptismDate) 
	{
		this.baptismDate = baptismDate;
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

	public Boolean getBaptismCourseCertificate() 
	{
		return baptismCourseCertificate;
	}

	public void setBaptismCourseCertificate(Boolean baptismCourseCertificate) 
	{
		this.baptismCourseCertificate = baptismCourseCertificate;
	}

	public Boolean getGodparentsReligiousMarriageCertificate() 
	{
		return godparentsReligiousMarriageCertificate;
	}

	public void setGodparentsReligiousMarriageCertificate(Boolean godparentsReligiousMarriageCertificate) 
	{
		this.godparentsReligiousMarriageCertificate = godparentsReligiousMarriageCertificate;
	}

	public Boolean getGodparentsCivilMarriageCertificate() 
	{
		return godparentsCivilMarriageCertificate;
	}

	public void setGodparentsCivilMarriageCertificate(Boolean godparentsCivilMarriageCertificate) 
	{
		this.godparentsCivilMarriageCertificate = godparentsCivilMarriageCertificate;
	}

	@Override
	public String toString() 
	{
		return "BaptismPerson [nameBaptism=" + nameBaptism + ", dateOfBirth=" + 
	dateOfBirth + ", placeOfBirth=" + placeOfBirth + ", fatherName=" + fatherName + 
	", placeOfBirthFather=" + placeOfBirthFather + ", telephoneFather=" + 
	telephoneFather + ", motherName=" + motherName + ", placeOfBirthMother=" + 
	placeOfBirthMother + ", telephoneMother=" + telephoneMother + 
	", marriedReligious=" + marriedReligious + ", marriedCivil=" + marriedCivil + 
	", baptismCourse=" + baptismCourse + ", address=" + address + 
	", godfatherName=" + godfatherName + ", godmotherName=" + godmotherName + 
	", baptismDate=" + baptismDate + ", city=" + city + ", birthCertificate=" + 
	birthCertificate + ", baptismCourseCertificate=" + baptismCourseCertificate + 
	", godparentsReligiousMarriageCertificate=" + godparentsReligiousMarriageCertificate + 
	", godparentsCivilMarriageCertificate=" + godparentsCivilMarriageCertificate + "]";
		
	}
	
	

}
