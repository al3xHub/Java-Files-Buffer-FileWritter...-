package es.studium.FicherosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FicheroTextoLectura
{

	public static void main(String[] args)
	{
		try
		{
			//abrir fichero
			FileReader fr = new FileReader("archivo.txt");
			BufferedReader br = new BufferedReader(fr);
			//cadena que sacará la información del fichero
			String contenido;
			
			//Trabajar fichero(sacar contenido)
			
			/*
			 * metodo que contenido saca informacion del bufferReader
			 * de esta manera sacaria solamente una linea de contenido
			 */
			//contenido = br.readLine();
			
			/*
			 * En este ejemplo saca todo el contenido con while.
			 * "Mientras el contenido tenga lineas sacalo hasta 
			 * que no haya nada".
			 */
			
			while((contenido = br.readLine())!=null)
			{
				//Por pantalla sacará el contenido
				
				System.out.println(contenido);
				
			}
			
			//Cerrar fichero
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
