package Interface1;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.emiteSom();
		c.cuidarPatio();
		c.exibeDados();
		
		Gato g = new Gato();
		g.emiteSom();
		g.exibeDados();

	}

}
