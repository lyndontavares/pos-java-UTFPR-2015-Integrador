package integradorrest;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;


/**
 * 
 * @author Lyndon Tavares
 *
 */
public class TransacaoServer {

	public static void main(String[] args) {
		try {
			
			System.out.println("Iniciar o servico bancario: http://localhost:3000/rest");
			
			HttpServer server = HttpServerFactory.create("http://localhost:3000/");
			
			server.start();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
