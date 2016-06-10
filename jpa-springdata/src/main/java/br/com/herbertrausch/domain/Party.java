package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Party implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParty;
	@ManyToOne
	private Usuario idUsuario1;
	@ManyToOne
	private Usuario idUsuario2;
	@ManyToOne
	private Usuario idUsuario3;
	@ManyToOne
	private Usuario idUsuario4;
	@ManyToOne
	private Usuario idUsuario5;
	@ManyToOne
	private Usuario idUsuario6;	
	
	public Long getIdParty() {
		return idParty;
	}
	public void setIdParty(Long idParty) {
		this.idParty = idParty;
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
	public Usuario getIdUsuario3() {
		return idUsuario3;
	}
	public void setIdUsuario3(Usuario idUsuario3) {
		this.idUsuario3 = idUsuario3;
	}
	public Usuario getIdUsuario4() {
		return idUsuario4;
	}
	public void setIdUsuario4(Usuario idUsuario4) {
		this.idUsuario4 = idUsuario4;
	}
	public Usuario getIdUsuario5() {
		return idUsuario5;
	}
	public void setIdUsuario5(Usuario idUsuario5) {
		this.idUsuario5 = idUsuario5;
	}
	public Usuario getIdUsuario6() {
		return idUsuario6;
	}
	public void setIdUsuario6(Usuario idUsuario6) {
		this.idUsuario6 = idUsuario6;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
