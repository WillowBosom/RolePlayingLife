package br.com.herbertrausch.domain;

public interface UsuarioRepositoryCustom {
	
	Usuario findByLogin(String login);

}

