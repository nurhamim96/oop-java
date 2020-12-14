public class PolymorphismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ibad");
        employee.sayHello("Budi");

        employee = new Manager("Ibad");
        employee.sayHello("Budi");

        employee = new VicePresident("Ibad");
        employee.sayHello("Budi");

        /* Contoh method polymorphisme */
        sayHello(new Employee("ibad"));
        sayHello(new Manager("Ibad"));
        sayHello(new VicePresident("Ibad"));
    }

    /* Contoh method polymorphisme */
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vp " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
