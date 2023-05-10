package hotel;

import java.util.HashMap;

import utile.Mates;

public class Hotel {
	private String name;
	private HashMap<Integer, Room> habitaciones;
	
	public static String ID_HAB = "el Id de la habitación ";
	
	Hotel() {
		name = "Este Hotel";
		Room r;
		habitaciones = new HashMap<Integer, Room>();
		for (int i = 1; i <3; i++) {
			r = new Room(100 + i, "ventana","individuales");
			habitaciones.put(r.getId(),r);
		}
		r = new Room(103, "terraza", "individuales");
		habitaciones.put(r.getId(), r);
		for (int i = 1; i <3; i++) {
			r = new Room(200 + i, "ventana","matrimonio");
			habitaciones.put(r.getId(),r);
		}
		r = new Room(203, "terraza", "matrimonio");
		habitaciones.put(r.getId(), r);
	}
	
	Hotel(String nombre) {
		this();
		this.name = nombre;
	} 
	
	Hotel(String nombre,HashMap<Integer,Room> habitaciones) {
		this.name = nombre;
		this.habitaciones = habitaciones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String mostrarHabitaciones() {
		String s = "Habitaciones en el hotel";
		for (int id:habitaciones.keySet()) {
			s += "\n" + habitaciones.get(id);
		}
		return s;
	}
	
	public String mostrarHabitacionesLibres() {
		String s = "Habitaciones en el hotel";
		for (int id:habitaciones.keySet()) {
			if (habitaciones.get(id).isDisponible()) {
				s += "\n" + habitaciones.get(id);
			}
		}
 		return s;
	}
	
	public String reservarHabitacion(int id) {
		if (habitaciones.containsKey(id) && habitaciones.get(id).isDisponible()) {
			habitaciones.get(id).setDisponible(false);
			return "La habitación con ID " + habitaciones.get(id).getId() + " ha sido reservada.";
		} else {
			return "La habitación no existe o ya está ocupada.";
		}
	}
	
	public String abandonarHabitacion(int id) {
		if (habitaciones.containsKey(id) && !habitaciones.get(id).isDisponible() ) {
			return calcularEstancia(habitaciones.get(id), Mates.randomInt(1, 5));
		} else {
			return "Error: La habitación no existe o no está ocupada";
		}
	}
	
	public String calcularEstancia(Room habitacion, int dias) {
		return habitacion.getImporteTotal(dias);	 
	}
}