package integrador.soap;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author Lyndon Tavares
 *
 */

public class BancarioServiceServer {

	public static void main(String[] args) {
		
		
		System.out.println("Iniciar o servico bancario:http://localhost:4000/soap");
		
		BancarioServiceImpl bank = new BancarioServiceImpl();
		
		Endpoint.publish("http://localhost:4000/soap",bank);
		
		
	}
	
}
