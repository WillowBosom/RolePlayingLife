package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class AmigoService {

	
	private AmigoRepository db;
	
	public AmigoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(AmigoRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Amigo> getAmigos() {
		try {
			
			List<Amigo> amigos = (List<Amigo>) db.findAll();
					
			return amigos;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Amigo>();

		}
	}
	
	public List<Amigo> getByIdAmizade(Long a){
		return db.findByIdAmizade(a);
	}
	
	public List<Amigo> getByIdUsuario1(Usuario a){
		return db.findByIdUsuario1(a);
	}
	
	public List<Amigo> getByIdUsuario2(Usuario a){
		return db.findByIdUsuario2(a);
	}
	

	public Amigo getAmigo(Long id) {
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

	
	public boolean save(Amigo amigo) {
		try {
			
				db.save(amigo);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
