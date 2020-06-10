package com.teste.teste.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Postagem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
		
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
		
	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
		
	@Temporal (TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

}
