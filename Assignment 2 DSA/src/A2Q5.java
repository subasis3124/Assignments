class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends person {
    int eid;
    double salary;

    Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }

    void empdisplay() {
        System.out.println("Name: " + name + ", Age: " + age + ", Emp ID: " + eid + ", Salary: " + salary);
    }
}

public class A2Q5 {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Employee("subasis ", 18 , 3212 , 1200000);
        e[1] = new Employee("subam ", 18 , 3215 , 1207);
        e[2] = new Employee("subans ", 18 , 3244 , 121);
        e[3] = new Employee("summ ", 18 , 3275 , 120);
        e[4] = new Employee("xxxxxxx ", 19 , 3052 , 1200);
        System.out.println("Name  Age  Emp ID  Salary");
        for(int i = 0; i < e.length; i++) {
            e[i].empdisplay();
        }
    }
}
