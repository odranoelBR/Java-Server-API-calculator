package control;

import javax.xml.ws.Endpoint;

public class Publicador {

	public static void main(String[] args){
		Endpoint.publish("http://localhost:8899/calcule", new Calcule());
	}
}
