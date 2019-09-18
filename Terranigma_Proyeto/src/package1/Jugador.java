package package1;

import java.util.Random;

public class Jugador extends Personaje 
{
	public Jugador(String nombre, int vida) {
		setNombre(nombre);
		setVida(vida);
	}
	
	

	public void Ataque1(Enemigos J) 
	{
		Random R1 = new Random();
		int P = R1.nextInt(15);
		int nVida1 = J.getVida() - P;
		J.setVida(nVida1);
		System.out.println("La nueva vida de "+J.getNombre()+" es de "+nVida1+" despues de un daño de "+P);
		if(nVida1 <=0) {
			System.out.println(J.getNombre()+" ha sido derribado");
		}
		
	}


		
	
	
}
