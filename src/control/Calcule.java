package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import model.ParseadorCalculadora;

@WebService
public class Calcule {

	@WebMethod
	public String calculeString(@WebParam(name="numero1") String numero1, 
								@WebParam(name="oprador") String operador, 
								@WebParam(name="numero2") String numero2){
		
		
		ParseadorCalculadora parser = new ParseadorCalculadora();
		
		String[] input = {numero1, operador, numero2};
		
		String[] output = parser.expToRPN(input);
		String retorno = parser.RPNtoDouble( output );
		
		return retorno;
	}
	
}
