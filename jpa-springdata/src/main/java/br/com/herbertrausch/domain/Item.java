package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;
   	private String nomeItem;
	private Long tipoItem;
	private Long preco;

	public Long idItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public Long getIdItem() {
		return idItem;
	}
	
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	
	public String getNomeItem() {
		return nomeItem;
	}
	
	public Long getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(Long tipoItem) {
		this.tipoItem = tipoItem;
	}
		
	public Long getPreco() {
		return preco;
	}
	
	public void setPreco(Long Preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "batata";
	}
}
