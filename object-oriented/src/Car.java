
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String... features) { //Var - args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Featured of "+ model);
		for(String f : features)
			System.out.println("> " + f);
	}
	
	public static void main(String[] args) {
		Car lato = new Car("Suzukki Alto","nitro engine", "v8", "suspesion", "air brkaes");
		lato.specs();
		
		Car astor = new Car("MG Astor", "ABS", "electirc","Auto","SunRoof");
		astor.specs();
	}
}
