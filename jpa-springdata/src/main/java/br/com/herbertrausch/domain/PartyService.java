package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PartyService {

	
	private PartyRepository db;
	
	public PartyService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PartyRepository.class);
		
	}

	// Lista todos as Parties do banco de dados
	public List<Party> getParties() {
		try {
			
			List<Party> parties = (List<Party>) db.findAll();
					
			return parties;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Party>();

		}
	}
	
	public List<Party> getByIdParty(Long a){
		return db.findByIdParty(a);
	}
	
	public List<Party> getByIdUsuario1(Usuario a){
		return db.findByIdUsuario1(a);
	}
	
	public List<Party> getByIdUsuario2(Usuario a){
		return db.findByIdUsuario2(a);
	}
	
	public List<Party> getByIdUsuario3(Usuario a){
		return db.findByIdUsuario3(a);
	}
	public List<Party> getByIdUsuario4(Usuario a){
		return db.findByIdUsuario4(a);
	}
	public List<Party> getByIdUsuario5(Usuario a){
		return db.findByIdUsuario5(a);
	}
	public List<Party> getByIdUsuario6(Usuario a){
		return db.findByIdUsuario6(a);
	}

	public Party getParty(Long id) {
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

	
	public boolean save(Party party) {
		try {
			
				db.save(party);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
