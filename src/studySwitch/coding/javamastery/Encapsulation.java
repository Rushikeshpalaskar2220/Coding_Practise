package studySwitch.coding.javamastery;

class Person
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name=name;

    }

}


public class Encapsulation {
    public static void main(String Args[])
    {
        Person person=new Person();
        person.setname("John");
        System.out.println(person.getName());

    }
}
