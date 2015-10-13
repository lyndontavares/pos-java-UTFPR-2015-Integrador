package integrador.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Lyndon Tavares
 *
 */

@Path("rest")
public class TransacaoResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Transacao> getTodasTransacoes() {
        return new TransacaoDAO().getTransacoes();
    }

    @Path("{numConta}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Transacao> getTransacoesPorConta(@PathParam("numConta") long numConta) {
    	TransacaoDAO dao = new TransacaoDAO();
        return dao.getTransacao(numConta);
    }

	
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Transacao addTransacao(Transacao transacao) {
    	TransacaoDAO dao = new TransacaoDAO();
        dao.criarTransacao(transacao);
        return transacao;
    }

}
