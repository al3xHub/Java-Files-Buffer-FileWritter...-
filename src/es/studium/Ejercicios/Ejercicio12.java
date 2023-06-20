package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio12
{

	public static void main(String[] args)
	{
		
			try
			{
				FileOutputStream fos = new FileOutputStream("uno.bin");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataOutputStream salidaB = new DataOutputStream(bos);
				int contenido = 0;
				
				//Escribir en teclado y meter el valor en el fichero binario
				System.out.println("Escribe un número: ");
				Scanner teclado = new Scanner(System.in);
				contenido = teclado.nextInt();
				teclado.close();
	
				salidaB.writeInt(contenido);
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


