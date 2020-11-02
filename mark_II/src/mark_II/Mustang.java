package mark_II;

public class Mustang extends Carro{
	public Mustang() {
		Comportamiento_de_Teletransportacion = new No_Teletransportable();
		Comportamiento_de_Llamar_Morty = new Sin_Morty();
	}
	public void mostrar() {
		System.out.println("*Tienda Ford*");
	}
	
	
	
	
}
