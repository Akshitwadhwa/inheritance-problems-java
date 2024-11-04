class person {
    String name;
    int age;

    // Constructor for Person class
    public person(String name, int age) {
        this.name = name; // Use 'this' to refer to the instance variable
        this.age = age;   // Use 'this' to refer to the instance variable
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Employee a = new Employee("Rohan", 30, 30000);
        a.displayDetails();
    }
}

// Employee class extending Person
class Employee extends person {
    int salary;

 
    public Employee(String name, int age, int salary) {
        super(name, age); // Call the constructor of Person
        this.salary = salary; // Use 'this' to refer to the instance variable
    }
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the displayDetails of Person
        System.out.println("Salary: " + salary);
    }

    
}


