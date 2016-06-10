package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class TavernaService {

	
	private TavernaRepository db;
	
	public TavernaService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(TavernaRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Taverna> getTaverna() {
		try {
			
			List<Taverna> Taverna = (List<Taverna>) db.findAll();
					
			return Taverna;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Taverna>();

		}
	}
	
	public List<Taverna> getByIdUsuario(Usuario a){
		return db.findByIdUsuario(a);
	}
	
	public List<Taverna> getByMensagem(Long a){
		return db.findByMensagem(a);
	}
	

	public Taverna getTaverna(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	// Deleta o carro pelo id
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

	// Salva ou atualiza o carro
	public boolean save(Taverna IdTaverna) {
		try {
			
				db.save(IdTaverna);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
