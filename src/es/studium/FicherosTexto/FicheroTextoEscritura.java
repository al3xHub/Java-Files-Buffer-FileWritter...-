package es.studium.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura
{

	public static void main(String[] args)
	{
		try
		{
			//abrir fichero
			
			FileWriter fw = new FileWriter("archivo.txt",true);
			/*
			 *  Sirve para escribir.
			 *  Entre los parentesis se puede escribir la ruta del archivo o en este ejemplo
			 *  sin ruta se guardaria en el mismo paquete del proyecto.
			 *  El boolean indica si sobreescribe los datos cada vez que pongamos algo o simplemente
			 *  lo intercambiamos,
			 */
			
			BufferedWriter bw = new BufferedWriter(fw);
			/*
			 * Esto es una memoria que intercambia los datos de nuestro programa de eclipse con nuestro fichero creado.
			 * 
			 * En BufferedWriter vemos al final"(fw)" Esto significa que esta asociado con el FileWriter
			 * 
			 */
			PrintWriter salida = new PrintWriter(bw);
			/*
			 * saca la información del bufferedwriter
			 * 
			 * en PrintWriter vemos al final "(bw)"eso significa que está asociado con bufferedWriter
			 */
			
			//trabajar fichero(contenido)
			
			salida.println("Ere un PinkFloyd");
			/*
			 * "salida" es el printwriter que va a escribir la información ".println" y lo va a meter en el fichero
			 */
			System.out.println("Información Almacenada");
			//cerrar fichero
			/*
			 * Hay que cerrar todo de forma contraria a cuando lo abrimos. Vamos cerrando de lo último
			 * que hemos abierto a lo primero.
			 */
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
