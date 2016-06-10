package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemRepository extends CrudRepository<Item, Long>{
	
	List<Item> findByIdItem(Long idItem);
	List<Item> findByNomeItem(String nomeItem);
	List<Item> findByTipoItem(Long tipoItem);
	List<Item> findByPreco(Long preco);
}

