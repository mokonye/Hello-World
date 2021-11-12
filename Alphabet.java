import java.util.ArrayList;

public class Alphabet
{
	public static void main(String [] args)
	{
	ArrayList<String> people = new ArrayList<>();
	people.add(0, "a");
	System.out.println(people);
	
	people.add(1, "e");
	System.out.println(people);
	
	people.size();
	for(int i = 0; i <people.size();i++){
		System.out.println(people.get(i));
	}
	
	people.add(2, "u");
	System.out.println(people);
	
	people.remove("a");
	System.out.println(people);
	
	people.remove("e");
	System.out.println(people);
	people.remove(1);
	System.out.println(people);
	System.out.println(people);
	System.out.println(people.size());
	System.out.println(people);
	System.out.println(people);
	System.out.println(people);
	System.out.println(people);
	}
}
