package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Mapa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMapa;
	private Long idSerie;
	private Long idMissao;
	
	
	public Long getIdMapa() {
		return idMapa;
	}
	public void setIdMapa(Long idMapa) {
		this.idMapa = idMapa;
	}
	public Long getIdSerie() {
		return idSerie;
	}
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}
	public Long getIdMissao() {
		return idMissao;
	}
	public void setIdMissao(Long idMissao) {
		this.idMissao = idMissao;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
