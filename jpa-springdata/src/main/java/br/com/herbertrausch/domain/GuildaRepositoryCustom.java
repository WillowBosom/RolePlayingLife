package br.com.herbertrausch.domain;

import java.util.List;

public interface GuildaRepositoryCustom {
	
	Guilda findByIdGuilda(Long idGuilda);
	Guilda findByIdUsuario(Usuario idUsuario);
	Guilda findByrankGuilda(Long rankGuilda);
}
