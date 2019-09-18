package package1;

import java.util.Scanner;

public class Menu 

{
	public void Batallar(Jugador player, Enemigos enemigo) 
	{
		Scanner myObj = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1- Atacar");
			System.out.println("2- Salir");
			var input = myObj.nextLine();
			if(input.equals("1")) {
				
				player.Ataque1(enemigo);
				enemigo.Atacar(player);
				
			}
			if(input.equals("2"))
			{
				System.out.println("Gracias por jugar Terranigma.V2");
				System.out.println("Vuelva pronto");
				break;
			}
		}
	}	
}