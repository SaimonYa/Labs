import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age=in.nextInt();
        float height=in.nextFloat();
        String name=in.nextLine();
        PersonEx person = new PersonEx(/*age, height, name*/);
        person.setGender(PersonEx.Gender.FEMALE);
        /*while(!person.setAge(age))
        {
            System.out.println("Mistake");
            age=in.nextInt();
        }
        while(!person.setHeight(height))
        {
            System.out.println("Mistake");
            height=in.nextInt();
        }
        person.setName(name);*/
        try {
            person.setAge(age);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            person.setHeight(height);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            person.setName(name);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person);
        System.out.println("Gender"+ person.getGender().getStrvalue());
    }
}