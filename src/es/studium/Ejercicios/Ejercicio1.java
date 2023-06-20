package es.studium.Ejercicios;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String Contenido= "";
		
		
		try
		{
			//abrir fichero
			FileWriter fw = new FileWriter("fich1.txt"); // con true, cuando ejecutamos, se guardan de nuevo el texto.
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			
			//trabajar fichero
			System.out.println("Escribe una clase");
			Contenido = teclado.nextLine();
			teclado.close();
			salida.println(Contenido);
			System.out.println("Informacion Almacenada");
			//cerrar fichero
			salida.close();
			bw.close();
			fw.close();
		}
		
		catch(IOException ioe)
		{
			System.out.println("Error en el fichero");
		}
	
	}

}
