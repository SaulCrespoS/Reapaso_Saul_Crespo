package utile;

public class ComparableClass implements Comparable<ComparableClass>{
	
	public String name;
	public int num;
	
	ComparableClass() {
		num = Mates.randomInt(0, 200);
		name = "Undefined";
	}
	ComparableClass(String name) {
		num = Mates.randomInt(0, 200);
		this.name = name;
	}
	
	@Override
	public int compareTo(ComparableClass o) {
		// TODO Auto-generated method stub
		return this.num - o.num;
	}
	
	@Override
	public String toString() {
		return "Numero: " + num + " Nombre: " + name;
	}

}
