package lambdas.basics.exercises;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kawrobel on 2016-05-02.
 */
public class Employee{
    private Integer age;
    private String name;
    public static final String[] names = {"Zdzich", "Romek", "Franek", "Wojtek", "Szymek", "John", "Mike", "Andrzej"};
    public Employee(Integer age){
        this.age = age;
    }

    public Employee(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    protected static ArrayList<Employee> generateEmployees(int howMany){
        Random rand = new Random();
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 0; i < howMany; i++){
            int random = rand.nextInt(80);
            employees.add(new Employee(random, names[random%8]));
        }
        return employees;
    }

}
