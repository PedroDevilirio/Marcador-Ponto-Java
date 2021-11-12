import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


class Ponto {
	public static void main (String[] args) {
		Scanner marcador = new Scanner (System.in);
		Calendar registro = Calendar.getInstance();
		
		// Variavel em que o horário fixo de entrada será definido.
		Date horario = 11:00:00;
		
		// Variavel em que o horario que o funcionario chegou será marcado
		Date horarioEntrada;
		
		// Variavel que checa a decisão do usuário
		int simNao;
		
		System.out.println("Bem-vindo a FakeTech E.P. Me diga, você é um: \n[1] Funcionário \n[2] Cliente");
		simNao = marcador.nextInt();
		
		if (simNao == 1) {
			System.out.println("Deseja marcar seu ponto de entrada agora? :D \n[1] Sim \n[2] Não");
		simNao = marcador.nextInt();
		
		if (simNao == 1) {
			horarioEntrada = registro.getTime();
			System.out.println("Horário marcado: "+ horarioEntrada + ".");
		}else {
			System.out.println("Aplicação encerrada!");
		}
			
		}else {
			System.out.println("Bem-vindo, cliente! Sinto informar que essa área é restrita para funcionários. :(");
		}
	}
}