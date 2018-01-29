package com.service.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "ruolo" )
public class Ruolo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7813687275785857043L;

	@Id
	@Column( name = "ruolo_ID")
	private int id;
	
	@Column( name = "Tipo_ruolo")
	private String tipoRuolo;
	
	@Column( name = "Attivo")
	private int attivo;

	@OneToOne (cascade=CascadeType.PERSIST)
	@JoinColumn( name = "luogo_id")
	private Luogo luogo;
	
	public Ruolo(){
		super();
	} 
	
	public Ruolo(int id, String tipoRuolo, int attivo){
		
		this.id = id;
		
		this.tipoRuolo = tipoRuolo;
		
		this.attivo = attivo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoRuolo() {
		return tipoRuolo;
	}

	public void setTipoRuolo(String tipoRuolo) {
		this.tipoRuolo = tipoRuolo;
	}

	public int getAttivo() {
		return attivo;
	}

	public void setAttivo(int attivo) {
		this.attivo = attivo;
	}
	
	public Luogo getLuogo() {
		return luogo;
	}

	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}

	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", tipoRuolo=" + tipoRuolo + ", attivo=" + attivo + ", luogo=" + luogo + "]";
	}


}
