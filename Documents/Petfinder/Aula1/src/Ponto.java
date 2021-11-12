import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


class Ponto {
	public static void main (String[] args) {
		Scanner marcador = new Scanner (System.in);
		Calendar registro = Calendar.getInstance();
		
		// Variavel em que o hor�rio fixo de entrada ser� definido.
		Date horario = 11:00:00;
		
		// Variavel em que o horario que o funcionario chegou ser� marcado
		Date horarioEntrada;
		
		// Variavel que checa a decis�o do usu�rio
		int simNao;
		
		System.out.println("Bem-vindo a FakeTech E.P. Me diga, voc� � um: \n[1] Funcion�rio \n[2] Cliente");
		simNao = marcador.nextInt();
		
		if (simNao == 1) {
			System.out.println("Deseja marcar seu ponto de entrada agora? :D \n[1] Sim \n[2] N�o");
		simNao = marcador.nextInt();
		
		if (simNao == 1) {
			horarioEntrada = registro.getTime();
			System.out.println("Hor�rio marcado: "+ horarioEntrada + ".");
		}else {
			System.out.println("Aplica��o encerrada!");
		}
			
		}else {
			System.out.println("Bem-vindo, cliente! Sinto informar que essa �rea � restrita para funcion�rios. :(");
		}
	}
}