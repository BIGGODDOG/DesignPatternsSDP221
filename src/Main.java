import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Ivan", 21, LocalDate.of(2002, Month.MARCH, 16));

        System.out.println(p1);

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = sc.nextLine();
        System.out.println("Write your age: ");
        int age = sc.nextInt();
        switch (age){
            case 1:
                System.out.println("You're kid");
                break;
            case 18:
                System.out.println("You're big guy");
                break;
            case 25:
                System.out.println("You're adult now!");
                break;
            default:
                System.out.println("You didn't entered your age");
                break;
        }
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        */
    }
}

class Person{
    private Long id;
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Person() {
    }
    public Person(Long id, String name, int age, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
