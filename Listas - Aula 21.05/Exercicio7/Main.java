package Exercicio7;

public class Main {

	public static void main(String[] args) {
		Notificacao app = new NotificacaoApp();
		app.enviar();
		
		NotificacaoEmail email = new NotificacaoEmail();
		email.enviar();
		
		email.enviar("marcelo.cmo");
		email.enviar("marcelo.cmo","fdf");

	}

}
