package p1;

public class Author {
private String name;
	
	Author(String name){
		this.name=name;
	}
	 
	@Override
	public String toString() {
		return "Autor" +
				"name= " + name + '\'' + '}';
	}
}
