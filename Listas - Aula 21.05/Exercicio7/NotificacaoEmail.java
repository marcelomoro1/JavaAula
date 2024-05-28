package Exercicio7;

public class NotificacaoEmail extends Notificacao{

	public void enviar(String email1) {
		System.out.println("enviado para o email: " + email1);
	}
	public void enviar(String email1, String email2) {
		System.out.println("enviado para os emails: "+email1 +", "+email2);
	}
	public void enviar() {
		System.out.println("Enviando para o email");
	}
}
