package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio14
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		
		Scanner teclado = new Scanner(System.in);
		int[] tabla = new int[TAM];
		
		for(int i = 0; i <TAM; i++)
		{
			System.out.println("Dame el valor " +(i+1));
			tabla[i] = teclado.nextInt();
		}
		try
		{
			
			teclado.close();
			
			FileOutputStream fos = new FileOutputStream("tabla1.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaB = new DataOutputStream(bos);
			for(int i = 0; i<TAM; i++)
			{
				salidaB.writeInt(tabla[i]);
				
			}
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("información guardada con éxito...");
			
			
		}
		catch(IOException ioe)
		{
			System.out.println("Error en el fichero");
		}
	}

}
