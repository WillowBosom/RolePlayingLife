package br.com.herbertrausch.domain;

import java.util.List;

public interface TavernaRepositoryCustom {
	
	Taverna findByIdTaverna(Long idTaverna);
	Taverna findByIdUsuario(Usuario idUsuario);
	Taverna findByMensagem(Long mensagem);
	Taverna findByIdGuilda(Guilda idGuilda);
}
