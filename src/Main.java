public class Main {
    private final static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Ivanov Ivan", 1, 10000);
        employees[1] = new Employee("Kurochkin Aleksey", 2, 20000);
        employees[2] = new Employee("Smirnov Sergey", 3, 30000);
        employees[3] = new Employee("Kostuk Ivan", 4, 40000);
        employees[4] = new Employee("Tolstov Evgeniy", 5, 50000);
        employees[5] = new Employee("Efremov Pavel", 1, 60000);
        employees[6] = new Employee("Mashkov Petr", 2, 20000);
        employees[7] = new Employee("Nikolaev Ivan", 3, 30000);
        employees[8] = new Employee("Babushkin Anatoliy", 4, 40000);
        employees[9] = new Employee("Kuznetsov Victor", 5, 50000);

        printAll();
        System.out.println(sum());
        System.out.println(min());
        System.out.println(max());
        System.out.println(average());
        printAllNames();
    }
    private static void printAll() {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double sum() {
        double sum = 0.0;
        for (Employee employee : employees) sum += employee.getSalary();
        return sum;
    }
    private static Employee min() {
        Employee minEmployee = employees[0];
        for ( Employee employee: employees) {
            if (employee.getSalary()< minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    private static Employee max() {
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double average() {
        return sum() / employees.length;
    }

    private static void  printAllNames () {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}