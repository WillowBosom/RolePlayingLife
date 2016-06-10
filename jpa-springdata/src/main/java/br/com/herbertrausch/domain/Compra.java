package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompra;
	@ManyToOne
	private Item idItem;
	@ManyToOne
	private Item preco;
	@ManyToOne
	private Item nomeItem;
	
	
	public Long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}
	
	public Item getIdItem(){
		return idItem;
	}
	public void setIdItem(){
		this.idItem = idItem;
	}
	
	public Item getPreco(){
		return preco;
	}
	public void setPreco(){
		this.preco = preco;
	}
	
	public Item getNomeItem(){
		return nomeItem;
	}
	public void setNomeItem(){
		this.nomeItem = nomeItem;
	}
	
	
	@Override
	public String toString() {
		return "batata";
	}
}
