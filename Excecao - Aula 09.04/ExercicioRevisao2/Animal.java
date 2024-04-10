package ExercicioRevisao2;

public class Animal {
	String nome;
	String especie;
	
	public Animal(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
        System.out.println("Nome do animal: " + this.nome);
        System.out.println("nome da especie: " + this.especie);
	}
	
	public Animal(String nome) {
		this.nome = nome;
        System.out.println("Nome do animal: " + this.nome);
	}
}
