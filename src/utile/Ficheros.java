package utile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Esta clase ha sido creada para leer y escribir en archivos de texto.
 * */
public class Ficheros {
	/**Accede a un archivo de texto para guardar su contenido en una String
	 * @param source La ruta mediante la cual se desea acceder al archivo.
	 * @return Una String que contiene todo el texto del archivo. Si no encuentra el archivo,
	 * devuelve una String vacía.*/
	public static  String lee(String source) {
		String temp = "";
		char c = 0;
		try {
			FileReader input = new FileReader(source);
			int n = input.read();
			while (n!= -1) {
				c = (char) n;
				temp += c;
				n = input.read();
				
			}
			input.close();
			
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
		return temp;
	}
	
	/**
	 * Escribe la String input en el archivo de texto referenciado en la ruta source.
	 * @param source La ruta para acceder al archivo de texto en cuestión.
	 * @param input La String que deseamos guardar en ese archivo.
	 * */
	public  void escribe(String source, String input) {
		try {
			//String temp = lee(source);
			FileWriter output = new FileWriter(source);
			//output.write(temp + "\n" + input);
			output.write(input);
			output.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
	}
}