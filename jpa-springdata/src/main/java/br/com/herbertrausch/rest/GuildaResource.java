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
import br.com.herbertrausch.domain.Usuario;

@Path("/guildas")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class GuildaResource{
	
	public GuildaService guildaService = new GuildaService();
	

	@GET
	public List<Guilda> get() {
		List<Guilda> guilda = guildaService.getGuilda();
		return guilda;
	}

	@GET
	@Path("{idGuilda}")
	public Guilda get(@PathParam("idGuilda") long id) {
		Guilda c = guildaService.getGuilda(id);
		return c;
	}

	@GET
	@Path("/idUsuario/{idUsuario}")
	public List<Guilda> getByIdUsuario(@PathParam("idUsuario") Usuario idUsuario) {
		List<Guilda> guilda = guildaService.getByIdUsuario(idUsuario);
		return guilda;
	}
	
	@GET
	@Path("/rankGuilda/{rankGuilda}")
	public List<Guilda> getByrankGuilda(@PathParam("rankGuilda") Long rankGuilda) {
		List<Guilda> guilda = guildaService.getByRankGuilda(rankGuilda);
		return guilda;
	}

	
	@DELETE
	@Path("{idGuilda}")
	public Response delete(@PathParam("idGuilda") long idGuilda) {
		guildaService.delete(idGuilda);
		return Response.Ok("Guilda deletado com sucesso");
	}

	@POST
	public Response post(Guilda c) {
		guildaService.save(c);
		return Response.Ok("Guilda salva com sucesso");
	}

	@PUT
	public Response put(Guilda c) {
		guildaService.save(c);
		return Response.Ok("Guilda atualizada com sucesso");
	}

}
