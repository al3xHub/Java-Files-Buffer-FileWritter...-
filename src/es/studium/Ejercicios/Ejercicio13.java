package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		{
			try
			{
				FileInputStream fis = new FileInputStream("uno.bin");
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream entradaB = new DataInputStream(bis);
				int contenido;
				contenido = entradaB.readInt();
				System.out.println(contenido);
				entradaB.close();
				bis.close();
				fis.close();
				
			}
			catch(FileNotFoundException fnfe)
			{
				System.out.println("El fichero no se encuentra");
			}
			catch(IOException ioe)
			{
				System.out.println("Error en el fichero");
			}
		}
	}

}
