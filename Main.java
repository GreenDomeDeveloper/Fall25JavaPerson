public class Main {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person("Sue", 50);
        Person three = new Person("Mark", -42);

        one.setName("Tom");
        one.setAge(42);

        System.out.println("Name: "+one.getName()+" Age: "+one.getAge());
        System.out.println("Name: "+two.getName()+" Age: "+two.getAge());

        two.setAge(-35);
        System.out.println("Name: "+two.getName()+" Age: "+two.getAge());

        one.haveBirthday();
        System.out.println("Name: "+one.getName()+" Age: "+one.getAge());

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
