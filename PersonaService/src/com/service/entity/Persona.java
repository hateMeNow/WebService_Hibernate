package com.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "persona" )
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7820583012051750891L;

	@Id
	@Column( name = "ID")
	private int id;
	
	@Column( name = "Nome")
	private String nome;
	
	@Column( name = "Cognome")
	private String cognome;
	
	@Column( name = "Codice_Fiscale")
	private String codice_fiscale;
	
	public Persona(){
		super();
	}
	
	public Persona(int id, String nome, String cognome, String codiceFiscale){
		
		this.id = id;
		
		this.nome = nome;
		
		this.cognome = cognome;
		
		this.codice_fiscale = cognome + nome;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodice_fiscale() {
		return codice_fiscale;
	}

	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codice_fiscale=" + codice_fiscale
				+ "]";
	}

	
}
