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

import br.com.herbertrausch.domain.Party;
import br.com.herbertrausch.domain.PartyService;
import br.com.herbertrausch.domain.Response;
import br.com.herbertrausch.domain.Usuario;

@Path("/party")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PartyResource {
	
	public PartyService partyService = new PartyService();
	

	@GET
	public List<Party> get() {
		List<Party> parties = partyService.getParties();
		return parties;
	}

	@GET
	@Path("{idParty}")
	public Party get(@PathParam("idParty") long id) {
		Party c = partyService.getParty(id);
		return c;
	}

	@GET
	@Path("/idUsuario1/{idUsuario1}")
	public List<Party> getByIdUsuario1(@PathParam("idUsuario1") Usuario idUsuario1) {
		List<Party> party = partyService.getByIdUsuario1(idUsuario1);
		return party;
	}
	

	@GET
	@Path("/idUsuario2/{idUsuario2}")
	public List<Party> getByIdUsuario2(@PathParam("idUsuario2") Usuario idUsuario2) {
		List<Party> party = partyService.getByIdUsuario2(idUsuario2);
		return party;
	}
	
	@GET
	@Path("/idUsuario3/{idUsuario3}")
	public List<Party> getByIdUsuario3(@PathParam("idUsuario3") Usuario idUsuario3) {
		List<Party> party = partyService.getByIdUsuario3(idUsuario3);
		return party;
	}
	
	@GET
	@Path("/idUsuario4/{idUsuario4}")
	public List<Party> getByIdUsuario4(@PathParam("idUsuario4") Usuario idUsuario4) {
		List<Party> party = partyService.getByIdUsuario4(idUsuario4);
		return party;
	}
	
	@GET
	@Path("/idUsuario5/{idUsuario5}")
	public List<Party> getByIdUsuario5(@PathParam("idUsuario5") Usuario idUsuario5) {
		List<Party> party = partyService.getByIdUsuario5(idUsuario5);
		return party;
	}
	
	@GET
	@Path("/idUsuario6/{idUsuario6}")
	public List<Party> getByIdUsuario6(@PathParam("idUsuario6") Usuario idUsuario6) {
		List<Party> party = partyService.getByIdUsuario6(idUsuario6);
		return party;
	}
	
	@DELETE
	@Path("{idParty}")
	public Response delete(@PathParam("idParty") long idParty) {
		partyService.delete(idParty);
		return Response.Ok("Party deletado com sucesso");
	}

	@POST
	public Response post(Party c) {
		partyService.save(c);
		return Response.Ok("Party salvo com sucesso");
	}

	@PUT
	public Response put(Party c) {
		partyService.save(c);
		return Response.Ok("Party atualizado com sucesso");
	}

}
