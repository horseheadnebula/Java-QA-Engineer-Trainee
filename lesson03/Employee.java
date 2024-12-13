public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО Сотрудника: " + this.fullName + "\n" + "Должность: " + this.position + "\n" + "Email: " + this.email + "\n" + "Номер телефона: " + this.phoneNumber + "\n" + "Зарплата: " + this.salary + "\n" + "Возраст: " + this.age + "\n");
    }
}
