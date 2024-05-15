package Exemplo1;

public class SobreescritaExemplo1 {

	public static void main(String[] args) {
		Animal nemo = new Animal();
		nemo.fazerSom();
		
		Animal catioro = new Cachorro();
		catioro.fazerSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
		
		Animal passaro = new Passarinho();
		passaro.fazerSom();
		
		Animal peixe = new Peixe();
		peixe.fazerSom();
		
		Animal bicho = new Hipopotamo();
		bicho.fazerSom();

	}

}
