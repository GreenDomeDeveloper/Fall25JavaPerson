public class Person {
    private String name;
    private int age;

    public Person(){
        name = "John";
        age = 21;
    }

    public Person(String name, int age){
        this.name = name;
        if (isValidAge(age)){
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

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
