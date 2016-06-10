package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Taverna implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTaverna;
	private Usuario idUsuario;
	private Long mensagem;
	
	
	public Long getIdTaverna() {
		return idTaverna;
	}
	public void setIdTaverna(Long idTaverna) {
		this.idTaverna = idTaverna;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getMensagem() {
		return mensagem;
	}
	public void setMensagem(Long mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
