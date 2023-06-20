package es.studium.Serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClaseSerializable implements Serializable
{
	//Serializable entiende como guardar la información
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		try
		{
			//Guardar archivo con el contenido serializado
			FileOutputStream fos = new FileOutputStream("archivo.dat");
			ObjectOutputStream objetoSalida = new ObjectOutputStream(fos);
			String cadena = "Me van a serializar kiyo...";
			//cerrar
			objetoSalida.writeObject(cadena);
			objetoSalida.close();
			fos.close();
			
			//Leer el contenido desserializado
			FileInputStream fis = new FileInputStream("archivo.dat");
			ObjectInputStream objetoEntrada = new ObjectInputStream(fis);
			String cadenaDestino = (String) objetoEntrada.readObject();
			System.out.println("Cadena leida: " +cadenaDestino);
			//cerrar
			objetoEntrada.close();
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("Error en la serialización");
		}
	}

}
