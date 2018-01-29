package com.service.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table ( name = "luogo")
public class Luogo {

	@Id
	@Column( name = "id")
	private int id;
	
	@Column( name = "descrizione")
	private String descrizione;
	
	@Column( name = "data")
	private Date date;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Luogo [id=" + id + ", descrizione=" + descrizione + ", date=" + date + "]";
	}
	
	
}
