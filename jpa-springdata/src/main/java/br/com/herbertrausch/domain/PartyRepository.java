package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PartyRepository extends CrudRepository<Party, Long>{
	
	List<Party> findByIdParty(Long IdParty);
	List<Party> findByIdUsuario1(Usuario IdUsuario1);
	List<Party> findByIdUsuario2(Usuario IdUsuario2);
	List<Party> findByIdUsuario3(Usuario IdUsuario3);
	List<Party> findByIdUsuario4(Usuario IdUsuario4);
	List<Party> findByIdUsuario5(Usuario IdUsuario5);
	List<Party> findByIdUsuario6(Usuario IdUsuario6);
	
}

