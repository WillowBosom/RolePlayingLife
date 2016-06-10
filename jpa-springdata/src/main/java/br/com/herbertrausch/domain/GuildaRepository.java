package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GuildaRepository extends CrudRepository<Guilda, Long>{
	
	List<Guilda> findByIdGuilda(Long idGuilda);
	List<Guilda> findByIdUsuario(Usuario idUsuario);
	List<Guilda> findByRankGuilda(Long rankGuilda);
	
}