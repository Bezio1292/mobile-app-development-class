import java.util.Vector;

public class Person{
    String Name;
    String Surname;
    int Age;
    Vector<String> Notes;

    Person(){
        Notes = new Vector<String>();
    }
    Person(String name, String surname){
        Notes = new Vector<String>();
        Name = name;
        Surname = surname;
    }

    public String GetFullName(){
        return Name + " " + Surname + " Age: " + Age;
    }
}