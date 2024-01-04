package Company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director yousef = new Director("Yousef", "IT", 80000, 50000);
        Engineer khaled = new Engineer("Khaled", "Call Center", 30000, new String[] {"fast", "smart", "communication"});
        SalesPerson mohammed = new SalesPerson("Mohammed", "Sales", 50000, 30);

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(yousef);
        System.out.println(khaled);
        System.out.println(mohammed);
    }
}
