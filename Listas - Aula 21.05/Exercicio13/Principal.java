package Exercicio13;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void ordemDeSaldo(List<Conta>lista) {
		double maior = -999;
		int numero = 0;
		String titular = "s";
		for(Conta c : lista) {
			if(c.getSaldo()>maior) {
				maior=c.getSaldo();
				numero = c.getNumero();
				titular = c.getTitular();
			}
		}
		System.out.println("O maior saldo eh de: "+maior);
		System.out.println("A conta eh : "+numero);
		System.out.println("O titular eh: "+titular);
	}
	
	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<Conta>();
		Conta p1 = new Conta(12312,"UEBA",200.0);
		Conta p2 = new Conta(14212,"mito",800.0);
		Conta p3 = new Conta(16312,"nunes",100.0);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		ordemDeSaldo(lista);
	}

}
