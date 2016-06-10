package br.com.herbertrausch.domain;

import java.util.List;

public interface MapaRepositoryCustom {
	
	Mapa findByidMapa(Long idMapa);
	Mapa findByidSerie(Long idSerie);
	Mapa findByidMissao(Long idMissao);
}