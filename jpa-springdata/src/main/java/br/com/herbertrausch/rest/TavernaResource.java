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

import br.com.herbertrausch.domain.Guilda;
import br.com.herbertrausch.domain.GuildaService;
import br.com.herbertrausch.domain.Response;
import br.com.herbertrausch.domain.Taverna;

@Path("/taverna")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class TavernaResource {
	
	public GuildaService guildaService = new GuildaService();
	

	@GET
	public List<Taverna> get() {
		List<Taverna> taverna = tavernaService.getTaverna();
		return taverna;
	}

	@GET
	@Path("{idTaverna}")
	public Taverna get(@PathParam("idTaverna") long id) {
		Taverna c = tavernaService.getTaverna(id);
		return c;
	}

	@GET
	@Path("/idUsuario/{idUsuario}")
	public List<Taverna> getByIdUsuario(@PathParam("idUsuario") Usuario idUsuario) {
		List<Taverna> taverna = tavernaService.getByIdUsuario(idUsuario);
		return taverna;
	}
	

	@GET
	@Path("/mensagem/{mensagem}")
	public List<Taverna> getBymensagem(@PathParam("mensagem") Long mensagem) {
		List<Taverna> taverna = tavernaService.getBymensagem(mensagem);
		return taverna;
	}
	
	@DELETE
	@Path("{idTaverna}")
	public Response delete(@PathParam("idTaverna") long idTaverna) {
		tavernaService.delete(idTaverna);
		return Response.Ok("Taverna deletada com sucesso");
	}

	@POST
	public Response post(Taverna c) {
		tavernaService.save(c);
		return Response.Ok("Taverna salva com sucesso");
	}

	@PUT
	public Response put(Taverna c) {
		tavernaService.save(c);
		return Response.Ok("Taverna atualizada com sucesso");
	}

}
