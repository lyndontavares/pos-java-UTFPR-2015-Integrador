package integrador.terminal;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import integrador.soap.BancarioService;
import integrador.soap.BancarioServiceImplService;
 


import integrador.terminal.util.Keyin;

/**
 *
 * @author Lyndon Tavares
 *
 */
public class TesteServicoBancario {

    private final static String bankREST = "http://localhost:3000/rest/";
    private final static String bankSOAP = "http://localhost:4000/soap/";

    public static void main(String[] args) {

        // Local variable
        int swValue = 0;
        int numConta = 0;
        double valor = 0;
        String nome;
        WebResource resource;
        Client client;
        BancarioServiceImplService acessor =  new BancarioServiceImplService();
        BancarioService bank =  acessor.getBancarioServiceImplPort();

        while (swValue != 8) {

            System.out.println("=================================================");
            System.out.println("|  MENU SERVICO BANCARIO                        |");
            System.out.println("=================================================");
            System.out.println("|  Opcoes:                                      |");
            System.out.println("|        1. Criar nova conta                    |");
            System.out.println("|        2. Consultar saldo de conta            |");
            System.out.println("|        3. Efetuar deposito de conta           |");
            System.out.println("|        4. Efetuar saque na conta              |");
            System.out.println("|        5. Fechar conta                        |");
            System.out.println("|        6. Listar todas as transacoes da conta |");
            System.out.println("|        7. Listar todas as transacoes          |");
            System.out.println("|        8. Sair                                |");
            System.out.println("=================================================");
            swValue = Keyin.inInt(" Opcao selecionada: ");

            switch (swValue) {

                case 8:

                    System.out.println("=======================");
                    System.out.println("Obrigado! Volte sempre!");
                    System.out.println("=======================");
                    break;

                case 1:

                    nome = Keyin.inString("Nova Conta > Informe Nome Cliente: ");
                    valor = Keyin.inDouble("Nova Conta > Informe Valor Saldo.: ");
                    
                    System.out.println("Nova Conta criada com sucesso> "+
                            bank.criarConta(nome, valor));
                    System.out.println("*************************************************");


                    break;
                case 2:

                    numConta = Keyin.inInt("Informe Num.Conta para consultar saldo: ");
                    System.out.println("CONTA> "+numConta+ "   SALDO: "+bank.consultarSaldo(numConta) );
                    System.out.println("*************************************************");

                    break;

                case 3:

                    numConta = Keyin.inInt("Informe Num.Conta para deposito: ");
                    valor = Keyin.inInt("Informe valor para deposito: ");

                    System.out.println("Aviso: " + 
                            bank.efetuarDeposito(numConta, valor));
                    System.out.println("*************************************************");

                    break;

                case 4:

                    numConta = Keyin.inInt("Informe Num.Conta para saque: ");
                    valor = Keyin.inInt("Informe valor para saque: ");

                    System.out.println("Aviso: " + 
                            bank.efetuarSaque(numConta, valor));
                    System.out.println("*************************************************");

                    break;

                case 5:

                    numConta = Keyin.inInt("Informe Num.Conta para fechamento: ");

                    System.out.println("Aviso: " + 
                            bank.fecharConta(numConta));
                    System.out.println("*************************************************");

                    break;

                case 6:

                    numConta = Keyin.inInt("Informe Num.Conta para listar transacoes: ");

                    client = Client.create();
                    resource = client.resource(bankREST + "");
                    System.out.println(resource);
                    System.out.println("*************************************************");

                    break;

                case 7:

                    client = Client.create();
                    resource = client.resource(bankREST);
                    String s = resource.get(String.class);
                    System.out.println(s);
                    System.out.println("*************************************************");

                    break;
                default:
                    break;
            }

        }

    }
}
