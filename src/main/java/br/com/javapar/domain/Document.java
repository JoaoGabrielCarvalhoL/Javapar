package br.com.javapar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Document extends GenericDomain
{
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String documentName;
	


}
