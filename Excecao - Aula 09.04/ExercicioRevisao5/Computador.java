package ExercicioRevisao5;

public class Computador {
	String marca;
	String modelo;
	String SO;

	public Computador(String marca, String modelo, String so) {
		this.marca = marca;
		this.modelo = modelo;
		this.SO = so;
        System.out.println("Marca do computador: " + this.marca);
        System.out.println("Modelo do computador: " + this.modelo);
        System.out.println("SO do computador: " + this.SO);
	}
	
	public Computador(String marca) {
		this.marca = marca;
        System.out.println("Marca do computador: " + this.marca);
	}
}
