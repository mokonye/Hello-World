import java.util.*;

// Create an ArrayList to store char values named vowels
// Add 1 vowel to the end
// Add 1 vowel to the beginning
// Find the number of objects stored in the vowels list
// Retrieve an object
// Remove an object
// Remove the last object w/o hardcoding the index value
class Main 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  ArrayList<Character> vowels = new ArrayList<Character>();
      vowels.add('e');
      vowels.add(0,'a');
      vowels.add('i');
	  
	  //printing initial list
      System.out.println("Initial list : ");
      printlist(vowels);
	  
      //adding element at the end
      System.out.println("\nEnter a vowel to insert at the end of list :");
	  char c = sc.next().charAt(0);
      atEnd(c, vowels);
      printlist(vowels);
	  
	  //adding element at the beginning
      System.out.println("\nEnter a vowel to insert at the beginnig of list :");
      c = sc.next().charAt(0);
      atBeginning(c, vowels);
      printlist(vowels);
	  
      //printing the size 
      System.out.println("\nSize of the vowels list : " + vowels.size());
	  
      //retrieving element from list.
      System.out.println("Enter an item to be retrieved : ");
      c = sc.next().charAt(0);
	  if(retrieve(c, vowels) != -1)
		  System.out.println("Present at position " + retrieve(c, vowels));
	  else
		  System.out.println("Not found");
	  
	  //remove an object
      System.out.println("Enter an item to be removed : ");
      c = sc.next().charAt(0);
      Character ch = new Character(c);
      vowels.remove(ch);
      printlist(vowels);
	  
	  //remove the last object
	  System.out.println("\nRemoving last object");
      vowels.remove(vowels.size()-1);
      printlist(vowels);
  }
  
  //function to print the list
  public static void printlist(ArrayList<Character> vowels)
  {
	  for (int i = 0; i < vowels.size(); i++) 
	  {
		  System.out.print(vowels.get(i) + " ");
	  }
  }
    
  //function to add elements at the end
  public static void atEnd(char c, ArrayList<Character> vowels)
  {
	  vowels.add(c);
	  }
	  
	  //function to add elements at the beginning
	  public static void atBeginning(char c, ArrayList<Character> vowels)
	  {
		  vowels.add(0,c);
		  }
		  
		  //retrieve element
		  public static int retrieve(char c, ArrayList<Character> vowels)
		  {
			  for (int i = 0; i < vowels.size(); i++) 
			  {
				  if(vowels.get(i) == c)
					  return i;
			  }
			  return -1;
		  }
}
	