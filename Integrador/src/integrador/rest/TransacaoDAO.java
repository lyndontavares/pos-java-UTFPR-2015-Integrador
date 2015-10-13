package integrador.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Lyndon Tavares
 *
 */

public class TransacaoDAO {

	private final String logFile = "./BancarioService.xml";

	List<Transacao> transacoes;

	public TransacaoDAO() {
		transacoes = new ArrayList<Transacao>();
		transacoes.add(new Transacao(1, "TESTE", "TESTE", new Date()));
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public List<Transacao> getTransacao(long numConta) {
		List<Transacao> listaTransacoes = new ArrayList<Transacao>();
		for (Transacao t : transacoes) {
			if (t.getNumeroConta() == numConta) {
				listaTransacoes.add(t);
			}
		}
		return listaTransacoes;
	}

	public Transacao criarTransacao(Transacao t) {
		
		
		
		

/*		try {
			
			String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<livros>\n" + "    <livro>\n"
					+ "        <id>01</id>\n" + "        <titulo>Cem anos de solidão</titulo>\n"
					+ "        <autor>Gabriel Garcia Marquez</autor>\n" + "    </livro>\n" + "</livros>";

			SAXParserFactory saxFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxFactory.newSAXParser();
			InputSource is = new InputSource(new StringReader(xmlString));
			saxParser.parse(is, new DefaultHandler());
			System.out.println("Documento XML na String processado.");
			
		} catch (ParserConfigurationException ex) {
			Logger.getLogger(SAXXMLParserCode02.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SAXException ex) {
			Logger.getLogger(SAXXMLParserCode02.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(SAXXMLParserCode02.class.getName()).log(Level.SEVERE, null, ex);
		}
*/
		transacoes.add(t);
		return t;
	}

	public void toFile(Transacao t) {

	}

}
