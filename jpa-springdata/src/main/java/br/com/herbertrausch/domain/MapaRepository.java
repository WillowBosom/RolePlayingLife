package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MapaRepository extends CrudRepository<Mapa, Long>{
	
	List<Mapa> findByIdMapa(Long idMapa);
	List<Mapa> findByIdSerie(Long idSerie);
	List<Mapa> findByIdMissao(Long idMissao);
}

