package br.com.herbertrausch.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pais
 *
 */
@Entity

public class Pais implements Serializable {

	   
	@Id
	private long id;
	private String pais;
	private static final long serialVersionUID = 1L;

	public Pais() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
   
}
