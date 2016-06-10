package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Guilda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGuilda;
	@ManyToOne
	private Usuario idUsuario;
	private Long rankGuilda;
	
	
	public Long getIdGuilda() {
		return idGuilda;
	}
	public void setIdGuilda(Long idGuilda) {
		this.idGuilda = idGuilda;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getrankGuilda() {
		return rankGuilda;
	}
	public void setrankGuilda(Long rankGuilda) {
		this.rankGuilda = rankGuilda;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
