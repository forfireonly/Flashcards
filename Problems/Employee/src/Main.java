
class Employee {

    String name;
    int salary;
    String address;
    static final String U = "unknown";

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
        this(U, 0, U);
    }
    public Employee(String name, int salary) {
        this(name, salary, U);

    }

}