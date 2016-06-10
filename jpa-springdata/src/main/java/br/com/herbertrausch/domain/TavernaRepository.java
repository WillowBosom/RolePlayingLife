package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TavernaRepository extends CrudRepository<Taverna, Long>{
	
	List<Taverna> findByIdTaverna(Long idTaverna);
	List<Taverna> findByIdUsuario(Usuario idUsuario);
	List<Taverna> findByMensagem(Long mensagem);
}

