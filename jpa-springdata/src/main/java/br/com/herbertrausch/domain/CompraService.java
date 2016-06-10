package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class CompraService {

	
	private CompraRepository db;
	
	public CompraService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(CompraRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Compra> getCompra() {
		try {
			
			List<Compra> Compra = (List<Compra>) db.findAll();
					
			return Compra;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Compra>();

		}
	}
	
	public List<Compra> findByIdCompra(Long a){
		return db.findByIdCompra(a);
	}
	
	public List<Compra> findByIdItem(Item a){
		return db.findByIdItem(a);
	}
	
	public List<Compra> findByNomeItem(Item a){
		return db.findByNomeItem(a);
	}
	
	public List<Compra> findByPreco(Item a){
		return db.findByPreco(a);
	}
	
	public Compra getCompra(Long id) {
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

	public boolean save(Compra IdCompra) {
		try {
			
				db.save(IdCompra);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
