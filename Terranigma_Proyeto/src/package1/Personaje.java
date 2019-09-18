package package1;

import java.util.Random;

public abstract class Personaje 
{
	int Vida, Experiencia;
	Random Poder;
	String Nombre;
	
	
	
	
	public int getVida() {
		return Vida;
	}
	public void setVida(int vida) {
		Vida = vida;
	}
	public int getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}
	public Random getPoder() {
		return Poder;
	}
	public void setPoder(Random poder) {
		Poder = poder;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	


	
	
}
