package package1;

import java.util.Random;

public class Enemigos extends Personaje
{
	public Enemigos(String nombre, int vida) 
	{
		setNombre(nombre);
		setVida(vida);
	}

	
	Random N = new Random();


	public void Atacar(Jugador player) {
		Random R = new Random();
		int T = R.nextInt(15);
		int nVida2 = player.getVida() - T;
		System.out.println("La nueva vida de  es de "+ nVida2+" despues de un daño de "+T);
		if(nVida2 <=0) {
			System.out.println("El jugador a sido derribado");
		}
				
	}
	
}

