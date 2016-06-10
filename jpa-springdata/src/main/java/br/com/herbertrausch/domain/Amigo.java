package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Amigo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAmizade;
	@ManyToOne
	private Usuario idUsuario1;
	@ManyToOne
	private Usuario idUsuario2;
	
	
	public Long getIdAmizade() {
		return idAmizade;
	}
	public void setIdAmigo(Long idAmigo) {
		this.idAmizade = idAmizade;
	}
	public Usuario getIdUsuario1() {
		return idUsuario1;
	}
	public void setIdUsuario1(Usuario idUsuario1) {
		this.idUsuario1 = idUsuario1;
	}
	public Usuario getIdUsuario2() {
		return idUsuario2;
	}
	public void setIdUsuario2(Usuario idUsuario2) {
		this.idUsuario2 = idUsuario2;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
