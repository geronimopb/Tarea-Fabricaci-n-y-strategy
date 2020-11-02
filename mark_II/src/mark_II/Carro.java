package mark_II;

public abstract class Carro {
	Comportamiento_de_Llamar_Morty Comportamiento_de_Llamar_Morty;
	Comportamiento_de_Teletransportacion Comportamiento_de_Teletransportacion;
	public abstract void mostrar();
	
	public void ejecutar_teletransportar(String dim){
		Comportamiento_de_Teletransportacion.teletransportar(dim);
	}
	
	public void ejecutarLlamarMorty() {
		Comportamiento_de_Llamar_Morty.llamarMorty();
	}
	
	public void setComportamiento_de_Llamar_Morty(Comportamiento_de_Llamar_Morty cdlm) {
		this.Comportamiento_de_Llamar_Morty = cdlm;
	}
	
	public void setComportamiento_de_Teletransportacion(Comportamiento_de_Teletransportacion cdt) {
		this.Comportamiento_de_Teletransportacion = cdt;
	}
	
}
