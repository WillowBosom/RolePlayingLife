package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Amigo;
import br.com.herbertrausch.domain.Item;
import br.com.herbertrausch.domain.ItemService;
import br.com.herbertrausch.domain.Response;

@Path("/item")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ItemResource {
	
	public ItemService itemService = new ItemService();
	

	@GET
	public List<Item> get() {
		List<Item> item = itemService.getItem();
		return item;
	}

	@GET
	@Path("{idItem}")
	public Item get(@PathParam("idItem") long id) {
		Item c = itemService.getItem(id);
		return c;
	}

	@GET
	@Path("/nomeItem/{nomeItem}")
	public List<Item> getByNomeItem(@PathParam("nomeItem") Item nomeItem) {
		List<Item> item = itemService.getItem();
		return item;
	}
	

	@DELETE
	@Path("{idItem}")
	public Response delete(@PathParam("idItem") long idItem) {
		itemService.delete(idItem);
		return Response.Ok("Item deletado com sucesso");
	}

	@POST
	public Response post(Item c) {
		itemService.save(c);
		return Response.Ok("Item salvo com sucesso");
	}

	@PUT
	public Response put(Item c) {
		itemService.save(c);
		return Response.Ok("Item atualizado com sucesso");
	}

}
