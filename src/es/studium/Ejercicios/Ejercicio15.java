package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		{
			try
			{
				final int TAM = 10;
				Scanner teclado = new Scanner(System.in);
				int [] tabla = new int[TAM];
				String nombreFichero ="";
				System.out.println("Dame el nombre del fichero");
				nombreFichero = teclado.nextLine();
				teclado.close();
				
				FileInputStream fis = new FileInputStream(nombreFichero);
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream entradaBinaria = new DataInputStream(bis);
			
				for(int i = 0; i<TAM; i++)
				{
					tabla[i] = entradaBinaria.readInt();
				}
				
				entradaBinaria.close();
				bis.close();
				fis.close();
				
				for(int numero: tabla)
				{
					System.out.println(numero);
				}
				
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
