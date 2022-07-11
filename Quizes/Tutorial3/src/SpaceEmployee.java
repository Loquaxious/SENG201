class SpaceEmployee {
    private final String name;
    private final String department;
    private final double salary;

    SpaceEmployee(String empName, String empDept, Double empSalary) {
        this.name = empName;
        this.department = empDept;
        this.salary = empSalary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }
}