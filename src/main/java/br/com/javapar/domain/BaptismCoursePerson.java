package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BaptismCoursePerson extends GenericDomain 
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameCourseBaptism;
	
	@Column(nullable = true)
	private Boolean parents;
	
	@Column(nullable = true)
	private Boolean godparents;
	
	@Column(nullable = true)
	private Boolean single; 
	
	@Column(nullable = true)
	private Boolean marriedInReligious;
	
	@Column(nullable = true)
	private Boolean marriedInCivil;
	
	@Column(nullable = true)
	private Boolean otherMaritalStatus;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(nullable = false, length = 50)
	private String namePersonBaptized;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date baptismCourseDate;

	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hourBaptismCourse;
	
	public BaptismCoursePerson()
	{
		
	}

	public BaptismCoursePerson(String nameCourseBaptism, String address, 
			String namePersonBaptized, Date baptismCourseDate, Date hourBaptismCourse) 
	{
		super();
		this.nameCourseBaptism = nameCourseBaptism;
		this.address = address;
		this.namePersonBaptized = namePersonBaptized;
		this.baptismCourseDate = baptismCourseDate;
		this.hourBaptismCourse = hourBaptismCourse;
	}




	public BaptismCoursePerson(String nameCourseBaptism, Boolean parents, 
			Boolean godparents, Boolean single, Boolean marriedInReligious, 
			Boolean marriedInCivil, Boolean otherMaritalStatus, String address, 
			String namePersonBaptized, Date baptismCourseDate, Date hourBaptismCourse) 
	{
		super();
		this.nameCourseBaptism = nameCourseBaptism;
		this.parents = parents;
		this.godparents = godparents;
		this.single = single;
		this.marriedInReligious = marriedInReligious;
		this.marriedInCivil = marriedInCivil;
		this.otherMaritalStatus = otherMaritalStatus;
		this.address = address;
		this.namePersonBaptized = namePersonBaptized;
		this.baptismCourseDate = baptismCourseDate;
		this.hourBaptismCourse = hourBaptismCourse;
	}

	public String getNameCourseBaptism() 
	{
		return nameCourseBaptism;
	}

	public void setNameCourseBaptism(String nameCourseBaptism)
	{
		this.nameCourseBaptism = nameCourseBaptism;
	}

	public Boolean getParents() 
	{
		return parents;
	}

	public void setParents(Boolean parents) 
	{
		this.parents = parents;
	}

	public Boolean getGodparents() 
	{
		return godparents;
	}

	public void setGodparents(Boolean godparents) 
	{
		this.godparents = godparents;
	}

	public Boolean getSingle() 
	{
		return single;
	}

	public void setSingle(Boolean single) 
	{
		this.single = single;
	}

	public Boolean getMarriedInReligious() 
	{
		return marriedInReligious;
	}

	public void setMarriedInReligious(Boolean marriedInReligious) 
	{
		this.marriedInReligious = marriedInReligious;
	}

	public Boolean getMarriedInCivil() 
	{
		return marriedInCivil;
	}

	public void setMarriedInCivil(Boolean marriedInCivil) 
	{
		this.marriedInCivil = marriedInCivil;
	}

	public Boolean getOtherMaritalStatus() 
	{
		return otherMaritalStatus;
	}

	public void setOtherMaritalStatus(Boolean otherMaritalStatus) 
	{
		this.otherMaritalStatus = otherMaritalStatus;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getNamePersonBaptized() 
	{
		return namePersonBaptized;
	}

	public void setNamePersonBaptized(String namePersonBaptized)
	{
		this.namePersonBaptized = namePersonBaptized;
	}

	public Date getBaptismCourseDate() 
	{
		return baptismCourseDate;
	}

	public void setBaptismCourseDate(Date baptismCourseDate) 
	{
		this.baptismCourseDate = baptismCourseDate;
	}

	public Date getHourBaptismCourse() 
	{
		return hourBaptismCourse;
	}

	public void setHourBaptismCourse(Date hourBaptismCourse) 
	{
		this.hourBaptismCourse = hourBaptismCourse;
	}

	@Override
	public String toString() 
	{
		return "BaptismCoursePerson [nameCourseBaptism=" + nameCourseBaptism + 
				", parents=" + parents + ", godparents=" + godparents + 
				", single=" + single + ", marriedInReligious=" + marriedInReligious + 
				", marriedInCivil=" + marriedInCivil + ", otherMaritalStatus=" + 
				otherMaritalStatus + ", address=" + address + 
				", namePersonBaptized=" + namePersonBaptized + 
				", baptismCourseDate=" + baptismCourseDate+ ", hourBaptismCourse=" + 
				hourBaptismCourse + "]";
	}
	
	
	
}
