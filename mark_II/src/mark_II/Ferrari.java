package mark_II;

public class Ferrari extends Carro{
	public Ferrari() {
		Comportamiento_de_Teletransportacion = new Teletransportable();
		Comportamiento_de_Llamar_Morty = new Un_Morty();
	}
	
	public void mostrar() {
		System.out.println("Soy Rick C-137");
	}
}
