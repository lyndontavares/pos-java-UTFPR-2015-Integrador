package integrador.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Lyndon Tavares
 *
 */
@WebService
public interface BancarioService {

    public @WebResult(name = "bs_numeroConta")
    long
            criarConta(@WebParam(name = "bs_nomeCliente") String nome,
                    @WebParam(name = "bs_saldoInicial") double saldo)
            ;

    public @WebResult(name = "bs_saldoConta")
    double
            consultarSaldo(@WebParam(name = "bs_numeroConta") long numConta)
             ;

    public @WebResult(name = "bs_resposta")
    String
            efetuarDeposito(@WebParam(name = "bs_numeroConta") long numConta,
                    @WebParam(name = "bs_valorDepositado") double valor)
            ;

    public @WebResult(name = "bs_resposta")
    String
            efetuarSaque(@WebParam(name = "bs_numeroConta") long numConta,
                    @WebParam(name = "bs_valorSacado") double valor)
            ;

    public @WebResult(name = "bs_resposta")
    String
            fecharConta(@WebParam(name = "bs_numeroConta") long numConta)
            ;
}
