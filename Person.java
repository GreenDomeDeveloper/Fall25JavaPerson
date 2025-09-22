import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private static int numPersons = 0;

    public Person(){
        name = "John";
        age = 21;
        numPersons++;
    }

    public Person(String name, int age){
        this.name = name;
        if (isValidAge(age)){
            this.age = age;
        } else {
            this.age = 0;
        }
        numPersons++;
    }

    public String getName(){
        return name;
    }

    public static int getNumPersons(){
        return numPersons;
    }

    public void setName(String name){
        this.name = name;
    }
    /*&public void setName(String name){
        Scanner scanner = new Scanner(System.in);
        String newName;
        System.out.println("Please enter your name: ");
        newName = scanner.next();
        this.name = newName;
    } */

    // setName("Bob");

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (isValidAge(age))
            this.age = age;
    }

    public void haveBirthday(){
        age++;
    }

    public String toString(){
        return "Person {\n\tName: "+name+"\n\tAge: "+age+"\n}";
    }

    private boolean isValidAge(int age){
        if (age>=0){
            return true;
        } else {
            return false;
        }
    }
}
