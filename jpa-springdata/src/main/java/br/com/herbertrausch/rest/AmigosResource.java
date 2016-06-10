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
import br.com.herbertrausch.domain.AmigoService;
import br.com.herbertrausch.domain.Response;
import br.com.herbertrausch.domain.Usuario;

@Path("/amigos")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class AmigosResource {
	
	public AmigoService amigoService = new AmigoService();
	

	@GET
	public List<Amigo> get() {
		List<Amigo> amigos = amigoService.getAmigos();
		return amigos;
	}

	@GET
	@Path("{idAmizade}")
	public Amigo get(@PathParam("idAmizade") long id) {
		Amigo c = amigoService.getAmigo(id);
		return c;
	}

	@GET
	@Path("/idUsuario1/{idUsuario1}")
	public List<Amigo> getByIdUsuario1(@PathParam("idUsuario1") Usuario idUsuario1) {
		List<Amigo> amigos = amigoService.getByIdUsuario1(idUsuario1);
		return amigos;
	}
	

	@GET
	@Path("/idUsuario2/{idUsuario2}")
	public List<Amigo> getByIdUsuario2(@PathParam("idUsuario2") Usuario idUsuario2) {
		List<Amigo> amigos = amigoService.getByIdUsuario2(idUsuario2);
		return amigos;
	}
	
	@DELETE
	@Path("{idAmizade}")
	public Response delete(@PathParam("idAmizade") long idAmizade) {
		amigoService.delete(idAmizade);
		return Response.Ok("Amigo deletado com sucesso");
	}

	@POST
	public Response post(Amigo c) {
		amigoService.save(c);
		return Response.Ok("Amigo salvo com sucesso");
	}

	@PUT
	public Response put(Amigo c) {
		amigoService.save(c);
		return Response.Ok("Amigo atualizado com sucesso");
	}

}
