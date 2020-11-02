package mark_II;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Existen 2 tipos de carros, Ferraris y Mustangs");
		System.out.println("Ingresa 1 si deseas crear un ferrari, ingresa 2 si deseas un Mustang");
		System.out.println("ingresa el tipo de carro:");
		int carro = sc.nextInt();
		int dato = 1;
		
		if(carro == 1) {
			Carro Ferrari = new Ferrari();
			
			Ferrari.mostrar();
			Ferrari.ejecutarLlamarMorty();
			Ferrari.ejecutar_teletransportar(" ");
		}else {
Carro Ferrari = new Mustang();
			
			Ferrari.mostrar();
			Ferrari.ejecutarLlamarMorty();
			Ferrari.ejecutar_teletransportar(" ");
		}
		
	}

}
