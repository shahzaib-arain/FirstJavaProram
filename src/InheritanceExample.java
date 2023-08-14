
        class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        class Employee extends Person {
            private int employeeId;

            public Employee(String name, int employeeId) {
                super(name); // Call the constructor of the base class (Person)
                this.employeeId = employeeId;
            }

            public int getEmployeeId() {
                return employeeId;
            }
        }
        // int his we use the first constructors and the inheritance and the first .
        public class InheritanceExample {
            public static void main(String[] args) {
                Employee employee = new Employee("John Doe", 12345);
                System.out.println("Employee Name: " + employee.getName());
                System.out.println("Employee ID: " + employee.getEmployeeId());

    }
}
