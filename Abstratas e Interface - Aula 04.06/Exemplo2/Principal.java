package Exemplo2;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(5,4);
		r.area();
		r.perimetro();

		Circulo c = new Circulo(3);
		c.area();
		c.perimetro();
		
		System.out.println("Retangulo - Area: "+r.area()+ " Perimetro: "+r.perimetro());
		System.out.println("Circulo - Area: "+c.area()+ " Perimetro: "+c.perimetro());
	}

}
