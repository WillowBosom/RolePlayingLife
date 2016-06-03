package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AmigoRepository extends CrudRepository<Amigo, Long>{
	
	List<Amigo> findByIdAmizade(Long IdAmizade);
	List<Amigo> findByIdUsuario1(Long IdUsuario1);
	List<Amigo> findByIdUsuario2(Long IdUsuario2);
	
}

