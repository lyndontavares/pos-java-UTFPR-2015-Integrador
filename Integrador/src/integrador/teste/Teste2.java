package integrador.teste;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Classe de Testes não integra o projeto.
 * Favor desconsiderar.
 * 
 * @author Lyndon Tavares
 *
 */
public class Teste2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		
		 //jax-sax de arquivo
		 File xmlfile = new File("./xml/arquivo01.xml");
		 SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		 SAXParser saxParser = saxFactory.newSAXParser();
		 saxParser.parse(xmlfile, new DefaultHandler());
		 System.out.println("O documento XML foi processado corretamente");

		 //jax-sax de file
		 String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				 "<livros>\n" +
				 " <livro>\n" +
				 " <id>01</id>\n" +
				 " <titulo>Cem anos de solidão</titulo>\n" +
				 " <autor>Gabriel Garcia Marquez</autor>\n" +
				 " </livro>\n" +
				 "</livros>";

				 SAXParserFactory saxFactory2 = SAXParserFactory.newInstance();
				 SAXParser saxParser2 = saxFactory2.newSAXParser();
				 InputSource is2 = new InputSource(new StringReader(xmlString));
				 saxParser2.parse(is2, new DefaultHandler());
				 System.out.println("Documento XML na String processado.");
				 
       //
	   	  		 
		
	}
	
}
