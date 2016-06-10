package br.com.herbertrausch.rest;

import java.security.Provider.Service;
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
import br.com.herbertrausch.domain.AmigoService;
import br.com.herbertrausch.domain.Mapa;
import br.com.herbertrausch.domain.Response;

@Path("/mapa")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class MapaResource {
	
	public Mapa MapaService = new MapaService();
	

	@GET
	public List<Mapa> get() {
		List<Mapa> Mapa = MapaService.getMapa();
		return Mapa;
	}

	@GET
	@Path("{idMapa}")
	public Mapa get(@PathParam("idMapa") long id) {
		Mapa c = Service.getMapa(id);
		return c;
	}

	@GET
	@Path("/idSerie")
	public List<Mapa> getByIdSerie(@PathParam("idSerie") Long idSerie) {
		List<Mapa> Mapa = MapaService.getByIdSerie(idSerie);
		return amigos;
	}
	

	@GET
	@Path("/idMissao")
	public List<Mapa> getByIdMissao(@PathParam("idMissao") Long idMissao) {
		List<Mapa> Mapa = MapaService.getByIdMissao(idMissao);
		return Mapa;
	}
	
	@DELETE
	@Path("{idMapa}")
	public Response delete(@PathParam("Mapa") long Mapa) {
		MapaService.delete(idMapa);
		return Response.Ok("Amigo deletado com sucesso");
	}

	@POST
	public Response post(Mapa c) {
		MapaService.save(c);
		return Response.Ok("Amigo salvo com sucesso");
	}

	@PUT
	public Response put(Mapa c) {
		MapaService.save(c);
		return Response.Ok("Amigo atualizado com sucesso");
	}

}
