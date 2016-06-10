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

import br.com.herbertrausch.domain.Compra;
import br.com.herbertrausch.domain.CompraService;
import br.com.herbertrausch.domain.Item;
import br.com.herbertrausch.domain.Response;

@Path("/Compra")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class CompraResource {
	
	public CompraService CompraService = new CompraService();
	

	@GET
	public List<Compra> get() {
		List<Compra> Compra = CompraService.getCompra();
		return Compra;
	}

	@GET
	@Path("{nomeItem}")
	public Compra get(@PathParam("nomeItem") Item a) {
		Compra c = (Compra) CompraService.getCompra();
		return c;
	}

	@GET
	@Path("/nomeItem/{nomeItem}")
	public List<Compra> getByNomeItem(@PathParam("nomeItem") Item nomeItem) {
		List<Compra> Compra = CompraService.findByNomeItem(nomeItem);
		return Compra;
	}
	
	@GET
	@Path("{idItem}")
	public Compra get1(@PathParam("idItem") Item a) {
		Compra c = (Compra) CompraService.getCompra();
		return c;
	}

	@GET
	@Path("/idItem/{idItem}")
	public List<Compra> getByIdItem(@PathParam("idItem") Item idItem) {
		List<Compra> Compra = CompraService.getByIdItem(idItem);
		return Compra;
	}
	
	@GET
	@Path("{idCompra}")
	public Compra get(@PathParam("idCompra") string a) {
		Compra c = CompraService.getCompra(a);
		return c;
	}

	@GET
	@Path("/idCompra/{idCompra}")
	public List<Compra> getByIdCompra(@PathParam("idCompra") Long idCompra) {
		List<Compra> Compra = CompraService.getByIdCompra(idCompra);
		return Compra;
	}
	


	@DELETE
	@Path("{idCompra}")
	public Response delete(@PathParam("idCompra") long idCompra) {
		CompraService.delete(idCompra);
		return Response.Ok("Compra deletado com sucesso");
	}

	@POST
	public Response post(Compra c) {
		CompraService.save(c);
		return Response.Ok("Compra salvo com sucesso");
	}

	@PUT
	public Response put(Compra c) {
		CompraService.save(c);
		return Response.Ok("Compra atualizado com sucesso");
	}

}
