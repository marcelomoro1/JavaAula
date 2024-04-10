package ExercicioRevisao3;

public class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        System.out.println("Lado 1 do triângulo: " + this.lado1);
        System.out.println("Lado 2 do triângulo: " + this.lado2);
        System.out.println("Lado 3 do triângulo: " + this.lado3);
    }
    
	public Triangulo(double lado) {
		this.lado1 = lado;
		this.lado2 = lado;
		this.lado3 = lado;
        System.out.println("Lado do triângulo: " + this.lado1);
	}
	
	public String tipoDeTriangulo(double lado1, double lado2, double lado3) {
		if(lado1 == lado2 && lado2 == lado3) {
			return "Triangulo Equilatero";
		}
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "Triangulo Isosceles";
		}
		else {
			return "Triangulo Escaleno";
		}
	}
}
