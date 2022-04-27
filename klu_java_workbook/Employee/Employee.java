package Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;

    Employee(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return String.format("Name"+name+"ID "+id+"Age %d",getAge());
    }
    @Override
    public int compareTo(Employee o) {
        if(age==o.getAge())
            return 0;
        else if(age>o.getAge())
            return 1;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(new Employee(456, " A ", 23));
        e.add(new Employee(457, " B ", 25));
        e.add(new Employee(458, " C ", 18));
        e.add(new Employee(459, " D ", 15));

        Collections.sort(e);
        for (Employee i:e){
            System.out.println(i);
        }
    }
}
