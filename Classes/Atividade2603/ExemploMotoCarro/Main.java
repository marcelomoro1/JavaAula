package ExemploMotoCarro;
//CRIE 2 MOTOS E 1 CARRO
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Moto mt1 = new Moto();
		Scanner sc = new Scanner(System.in);
		//MOTO 1
		System.out.println("Digite a marca da moto 1");
		mt1.marca = sc.nextLine();
		
		System.out.println("Digite o modelo da moto 1");
		mt1.modelo = sc.nextLine();
		
		System.out.println("Digite a cilindradas da moto 1");
		mt1.cilindradas = sc.nextLine();
		
		mt1.valores(mt1.marca, mt1.modelo, mt1.cilindradas);
		
		ArrayList<String> Lista1 = mt1.retornarValores();	
		System.out.println("Moto 1: "+Lista1);
		
		//MOTO 2
		Moto mt2 = new Moto();
		System.out.println("Digite a marca da moto 2");
		mt2.marca = sc.nextLine();
		
		System.out.println("Digite o modelo da moto 2");
		mt2.modelo = sc.nextLine();
		
		System.out.println("Digite a cilindradas da moto 2");
		mt2.cilindradas = sc.nextLine();
		
		mt2.valores(mt2.marca, mt2.modelo, mt2.cilindradas);
		
		ArrayList<String> Lista2 = mt2.retornarValores();	
		System.out.println("Moto 2: "+Lista2);
		
		//CARRO
		Carro car = new Carro();
		
		System.out.println("Digite a marca do carro");
		car.marca = sc.nextLine();
		
		System.out.println("Digite o modelo do carro");
		car.modelo = sc.nextLine();
		
		String carmarca = car.retornaMarcaCarro();
		String carmodelo = car.retornaModeloCarro();
		
		System.out.println("Modelo do carro: "+carmodelo+ " marca do carro: "+carmarca);
		sc.close();
	}

}
