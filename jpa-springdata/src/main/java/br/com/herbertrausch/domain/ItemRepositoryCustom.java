package br.com.herbertrausch.domain;

import java.util.List;

public interface ItemRepositoryCustom {
	
	
	Item findByIdItem(Long idItem);
	Item findByNomeItem(String nomeItem);
	Item findByTipoItem(Long tipoItem);
	Item findByPreco(Long preco);
}
