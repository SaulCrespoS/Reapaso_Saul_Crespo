package hotel;

import java.util.Scanner;
import utile.Mates;

public class App {
	public static Scanner scan = new Scanner(System.in);
	public static boolean run = true;
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel(introduzcaString("el nombre del hotel"));
		System.out.println("BIENVENIDO A " + h.getName().toUpperCase());
		 
		do {
			System.out.println("¿Qué desea hacer?"
					+ "\n\t-1) Mostrar todas las habitaciones."
					+ "\n\t-2) Reservar una habitación."
					+ "\n\t-3) Abandonar habitación."
					+ "\n\t-4) Salir.");
			
			switch(scan.nextLine().charAt(0)) {
				case '1' -> System.out.println(h.mostrarHabitaciones());
				case '2' -> System.out.println(reservarHabitacion(h));
				case '3' -> System.out.println(h.abandonarHabitacion(introduzcaInt(Hotel.ID_HAB)));
				case '4' -> run = false; 
				default -> System.out.println("Entrada incorrecta.");
			}
		} while(run);
		
		System.out.println("¡Hasta pronto!");
		scan.close();
	}
	
	public static String  reservarHabitacion(Hotel hotel) {
		System.out.println(hotel.mostrarHabitacionesLibres()); 
		return hotel.reservarHabitacion(introduzcaInt(Hotel.ID_HAB));
	}
	
	public static String introduzcaString(String name) {
		System.out.print("Introduzca " + name + ": ");
		return scan.nextLine();
	}
	
	public static int introduzcaInt(String name) {
		System.out.print("Introduzca " + name + ": ");
		try {
			return Integer.parseInt(scan.nextLine());
		} catch(Exception e) {
			System.out.println("Entrada incorrecta. Por favor, introduzca un número entero.");
			return 0;
		} 
	}
}