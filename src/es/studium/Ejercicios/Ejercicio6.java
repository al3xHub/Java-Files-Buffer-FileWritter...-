package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		try
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Dame el nombre del fichero archivo");
			String archivo = teclado.nextLine();
			System.out.println("Dame el nombre de fichero destino");
			String fich1 = teclado.nextLine();
			
			teclado.close();
			//abrir fichero
			FileReader fr = new FileReader("archivo.txt");
			FileWriter fw1 = new FileWriter("fich1.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw1 = new BufferedWriter(fw1);
			PrintWriter pw1 = new PrintWriter(bw1);
			String contenido;
		
			//cadena que sacará la información del fichero
			
			while((contenido=br.readLine())!=null)
			{
				pw1.println(contenido);
			}
			
			System.out.println("Informacion copiada!");
			
			//cerrar fichero
			
			br.close();
			fr.close();
			pw1.close();
			bw1.close();
			fw1.close();
			
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
