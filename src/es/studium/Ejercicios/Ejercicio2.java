package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		try {
			
		FileReader fr = new FileReader("fich1.txt");
		BufferedReader br = new BufferedReader(fr);
		String Contenido;
		
		
		while((Contenido=br.readLine())!=null)
		{
			System.out.println(Contenido);
		}
		
		
		
		br.close();
		fr.close();
		}
		
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Fichero no encontrado"); //Error que puede producirse por no encontrar el fichero
		}
		catch(IOException ioe)// IOEXCEPTION (Error que puede producirse por que no hay espacio en el disco duro)
		{
			System.out.println("Error en Fichero");
		}
		
		
			
		
			
		
	}

}
