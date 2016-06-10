package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CompraRepository extends CrudRepository<Compra, Long>{
	
	List<Compra> findByIdCompra(Long idCompra);
	List<Compra> findByPreco(Item preco);
	List<Compra> findByNomeItem(Item nomeItem);
	List<Compra> findByIdItem(Item idItem);
	
}
