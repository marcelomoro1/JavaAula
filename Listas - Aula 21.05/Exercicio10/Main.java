package Exercicio10;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void exibirMedia(double nota1, double nota2) {
		double media = (nota1+nota2)/2;
		if (media>6) {
			System.out.println("Aluno aprovado, media: "+ media);
		}
		else {
			System.out.println("TA REPROVADO");
		}
	}
	
	public static void main(String[] args) {
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno a1 = new Aluno("Brabo",6.0,8.0);
		Aluno a2 = new Aluno("Mito",9.0,4.8);
		Aluno a3 = new Aluno("Guerreiro",3.0,7.0);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		for(Aluno i:lista) {
			System.out.println("Aluno:"+" "+i.getNome()+", nota 1: "+i.getNota1()+", nota 2: "+i.getNota2());
			exibirMedia(i.getNota1(),i.getNota2());
		}

	}

}
