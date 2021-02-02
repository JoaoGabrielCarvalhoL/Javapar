package br.com.javapar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class AppointmentScheduling extends GenericDomain
{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date appointmentDate;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date appointmentTime;
	
	@Column(nullable = false, length = 50)
	private String appointmentLocation;
	
	@ManyToMany
	private Services appointment;
	

}
