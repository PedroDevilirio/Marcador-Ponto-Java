import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


class Ponto {
	private static Scanner marcador = new Scanner (System.in);
	private static Calendar registro = Calendar.getInstance();
		
	public static void main (String[] args){
		System.out.println("Bem-vindo a FakeTech E.P. Me diga, voc� � um: \n[1] Funcion�rio \n[2] Cliente");	
		
		int choice = marcador.nextInt();
		setPoint(choice);
	}
		private static void setPoint(int choice) {
			Date horarioEntrada;
			if (choice == 1) {
				System.out.println("Deseja marcar seu ponto de entrada agora? :D \n[1] Sim \n[2] N�o");
				int secondChoice = marcador.nextInt();
				
				if (secondChoice == 1) {
					horarioEntrada = registro.getTime();
					System.out.println("Hor�rio registrado. " + horarioEntrada);
				}else {
					System.out.println("Tudo bem, foi um prazer te atender!.");
					return;
				}
			}else if(choice == 2){
				System.out.println("Esta fun��o � exclusiva para funcion�rios.");
				return;
			}else {
				System.out.println("Desculpa, n�o reconhe�o este comando!");
				return;
			}
		}
	}