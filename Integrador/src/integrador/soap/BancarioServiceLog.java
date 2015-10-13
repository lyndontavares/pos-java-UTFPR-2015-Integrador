package integrador.soap;
/**
 * 
 * @author Lyndon Tavares
 *
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import integrador.rest.Transacao;

public class BancarioServiceLog {
	
	   public void addLog(Transacao transacao) {
	        Client client = Client.create();
	        WebResource resource = client.resource("http://localhost:3000/rest");
	        Transacao s = resource.post(Transacao.class);
	        System.out.println(s);
	    }

	
	
}
