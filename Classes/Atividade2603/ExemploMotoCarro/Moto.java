package ExemploMotoCarro;

import java.util.ArrayList;



public class Moto {
	String marca;
	String modelo;
	String cilindradas;
	
	
	public void valores(String marcaMoto, String modeloMoto, String cil) {
		marca = marcaMoto;
		modelo = modeloMoto;
		cilindradas = cil;
	}
	
	public ArrayList<String> retornarValores() {
		ArrayList<String> Lista = new ArrayList<String>();
		Lista.add(marca);
		Lista.add(modelo);
		Lista.add(cilindradas);
		return Lista;
	}
	
}

