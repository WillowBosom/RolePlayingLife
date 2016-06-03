package br.com.herbertrausch.domain;

import java.util.List;

public interface AmigoRepositoryCustom {
	
	Amigo findByIdAmizade(Long IdAmizade);
	Amigo findByIdUsuario1(Long IdUsuario1);
	Amigo findByIdUsuario2(Long IdUsuario2);
}
