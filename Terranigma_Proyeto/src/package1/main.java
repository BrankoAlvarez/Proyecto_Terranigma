package package1;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) 
	{
		System.out.println("Bienvenido a Terranigma.V2");
		System.out.println("Usted se llama Ark");
		System.out.println("Un juego de combate de 1vs1 que sera decidido por la suerte del jugador");
	
		Jugador J1 = new Jugador("Ark", 100);
		
		Enemigos E1 = new Enemigos("Bloody Mary", 350);
		Enemigos E2 = new Enemigos("Soul Knight", 172);
		Enemigos E3 = new Enemigos("Dark Gaia", 1000);
		Enemigos E4 = new Enemigos("Three Cadets", 100);
		
		List<Enemigos>enemigos = new ArrayList<Enemigos>();
		enemigos.add(E1);
		enemigos.add(E2);
		enemigos.add(E3);
		enemigos.add(E4);

		
		Menu M1 = new Menu();
		
		for(Enemigos enemigo: enemigos) 
		{
			M1.Batallar(J1, enemigo);
		}
		
	}
	
//Profesor no logramos dar por terminado el ciclo while y uso de  interfaz, nos disculpamos por no lograr lo acordado.
}
