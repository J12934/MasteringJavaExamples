import java.util.ArrayList;
import java.util.List;

public class Person {

    public String Name;

    public Person (String name){
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int hashCode (Person person1, Person person2){
        return person1.Name.compareTo(person2.Name);
    }


    public static void main(String[] args){

        List<Person> myPersonList = new ArrayList<Person>();
        myPersonList.add(new Person ("Jannik"));
        myPersonList.add(new Person ("Christoph"));
        myPersonList.add(new Person ("Joshua"));
        myPersonList.add(new Person ("Shiriam"));
        //Queue
        //Set
        //Map
    }



}
// Christoph Jannik Jorge Joshua Shriram
// Avaz Uche Tim Sylvia Anna
// Simon Henning Lasse Emmy
// Rajisha Sudesh Kiran Indra Ali