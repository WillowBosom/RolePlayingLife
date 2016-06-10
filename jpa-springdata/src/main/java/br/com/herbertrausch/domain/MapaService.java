package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class MapaService {

	
	private MapaRepository db;
	
	public MapaService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(MapaRepository.class);
		
	}

	// Lista todos as Parties do banco de dados
	public List<Mapa> getMapa() {
		try {
			
			List<Mapa> Mapa = (List<Mapa>) db.findAll();
					
			return Mapa;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Mapa>();

		}
	}
	
	public List<Mapa> getByIdMapa(Long a){
		return db.findByIdMapa(a);
	}
	
	public List<Mapa> getByIdSerie(Long a){
		return db.findByIdSerie(a);
	}
	
	public List<Mapa> getByIdMissao(Long a){
		return db.findByIdMissao(a);
	}
	public Mapa getMapa(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public boolean delete(Long id) {
		try {
			db.delete(id);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean save(Mapa mapa) {
		try {
			
				db.save(mapa);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
