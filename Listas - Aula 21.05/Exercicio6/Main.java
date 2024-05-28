package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Gerente f1 = new Gerente();
		f1.setNome("Marcos");
		f1.setSalario(500);
		Desenvolvedor f2 = new Desenvolvedor();
		f2.setNome("Roger");
		f2.setSalario(500);
		f2.setHorasExtras(10);
		
		f1.aumentarSalario(f1);
		f2.aumentarSalario();
		
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(f1);
		lista.add(f2);
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).toString());
		}

	}

}
