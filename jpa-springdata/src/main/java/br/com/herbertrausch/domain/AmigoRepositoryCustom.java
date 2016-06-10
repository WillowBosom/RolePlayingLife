package br.com.herbertrausch.domain;

import java.util.List;

public interface AmigoRepositoryCustom {
	
	Amigo findByIdAmizade(Long idAmizade);
	Amigo findByIdUsuario1(Usuario idUsuario1);
	Amigo findByIdUsuario2(Usuario idUsuario2);
}
