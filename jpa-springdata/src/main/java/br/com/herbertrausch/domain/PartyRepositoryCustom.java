package br.com.herbertrausch.domain;

import java.util.List;

public interface PartyRepositoryCustom {
	
	Party findByIdParty(Long idParty);
	Party findByIdUsuario1(Usuario idUsuario1);
	Party findByIdUsuario2(Usuario idUsuario2);
	Party findByIdUsuario3(Usuario idUsuario3);
	Party findByIdUsuario4(Usuario idUsuario4);
	Party findByIdUsuario5(Usuario idUsuario5);
	Party findByIdUsuario6(Usuario idUsuario6);
}