package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class GuildaService {

	
	private GuildaRepository db;
	
	public GuildaService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(GuildaRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Guilda> getGuilda() {
		try {
			
			List<Guilda> guilda = (List<Guilda>) db.findAll();
					
			return guilda;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Guilda>();

		}
	}
	
	public List<Guilda> getByIdGuilda(Long a){
		return db.findByIdGuilda(a);
	}
	
	public List<Guilda> getByIdUsuario(Usuario a){
		return db.findByIdUsuario(a);
	}
	public List<Guilda> getByRankGuilda(Long a){
		return db.findByRankGuilda(a);
	}

	public Guilda getGuilda(Long id) {
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

	
	public boolean save(Guilda guilda) {
		try {
			
				db.save(guilda);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
