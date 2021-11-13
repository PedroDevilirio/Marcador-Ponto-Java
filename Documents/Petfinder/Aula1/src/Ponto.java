import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


class Ponto {
	private static Scanner marcador = new Scanner (System.in);
	private static Calendar registro = Calendar.getInstance();
		
	public static void main (String[] args){
		System.out.println("Bem-vindo a FakeTech E.P. Me diga, você é um: \n[1] Funcionário \n[2] Cliente");	
		
		int choice = marcador.nextInt();
		setPoint(choice);
	}
		private static void setPoint(int choice) {
			Date horarioEntrada;
			if (choice == 1) {
				System.out.println("Deseja marcar seu ponto de entrada agora? :D \n[1] Sim \n[2] Não");
				int secondChoice = marcador.nextInt();
				
				if (secondChoice == 1) {
					horarioEntrada = registro.getTime();
					System.out.println("Horário registrado. " + horarioEntrada);
				}else {
					System.out.println("Tudo bem, foi um prazer te atender!.");
					return;
				}
			}else if(choice == 2){
				System.out.println("Esta função é exclusiva para funcionários.");
				return;
			}else {
				System.out.println("Desculpa, não reconheço este comando!");
				return;
			}
		}
	}