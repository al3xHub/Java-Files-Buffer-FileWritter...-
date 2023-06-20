package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LeerEjercicio16
{

	public static void main(String[] args) 
	{
		try
		{
			final int TAM = 10;
			
			int [] tabla = new int[TAM];
			
			
			
			FileInputStream fis = new FileInputStream("tabla2.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream entradaBinaria = new ObjectInputStream(bis);
		
				tabla = (int[]) entradaBinaria.readObject();
			
			
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
		catch (ClassNotFoundException e)
		{
			System.out.println("Clase no encontrado");
			e.printStackTrace();
		}
	}

}
