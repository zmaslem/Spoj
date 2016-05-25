package lambdas.basics.exercises;

import java.util.List;

/**
 * Created by kawrobel on 2016-05-05.
 */
public class InterfacesTypesTest {
    static Employee employee = new Employee(9);
    public static void main(String[] args){
        Predicate<Employee> matcher = f -> f.getAge() > 50;
        if(!matcher.test(employee))
            doSth(employee);
    }

    private static void doSth(Employee emp){
        System.out.println(emp.getAge());
    }

    private static <T> T findEmployeeByAge(List<T> employees,
                                         Predicate<T> matchFunction){
        for(T e: employees){
            if(matchFunction.test(e)){
                return e;
            }
        }
        return null;
    }
}