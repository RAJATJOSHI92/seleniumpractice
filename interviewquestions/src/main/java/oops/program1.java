package oops;

class Person
{
    int age;
    String name;

    Person(int age, String name)
    {
        this.age=age;
       this.name=name;

        System.out.println(this.age + this.name);
    }

}

public class program1
{
    public static void main(String[] args)
    {
        Person p= new Person(20,"rajat");
    }
}
