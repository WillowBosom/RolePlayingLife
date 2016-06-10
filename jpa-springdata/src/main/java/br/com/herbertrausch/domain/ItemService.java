package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ItemService {

	
	private ItemRepository db;
	
	public ItemService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ItemRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Item> getItem() {
		try {
			
			List<Item> Item = (List<Item>) db.findAll();
					
			return Item;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Item>();

		}
	}
	
	public List<Item> findByIdItem(Long a){
		return db.findByIdItem(a);
	}

	public List<Item> findByPreco(Long a){
		return db.findByPreco(a);
	}
	
	public Item getItem(Long id) {
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

	public boolean save(Item idItem) {
		try {
			
				db.save(idItem);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
