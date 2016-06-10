package br.com.herbertrausch.domain;

import java.util.List;

public interface CompraRepositoryCustom {
	
	
	Compra findByIdCompra(Long idCompra);
	Compra findByIdItem(Item idItem);
	Compra findByNomeItem(Item nomeItem);
	Compra findByPreco(Item preco);
}
