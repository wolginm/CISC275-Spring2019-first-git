import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}

class Animal {
    String name;
    int numLegs;

    public int getLegs(){
	return numLegs;
    }

    @Override
    public String toString() {
	return name + ", " + numLegs;
    }
}

class Dog extends Animal {
    public Dog(String n, int l) {
	name = n;
	numLegs = l;
    }
}
