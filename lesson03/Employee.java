public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО Сотрудника:" + this.fullName + "\n" + "Должность:" + "\n" + this.position + "\n" + "Email:" + "\n" + this.email + "\n" + "Номер телефона:" + "\n" + this.phoneNumber + "\n" + "Зарплата:" + this.salary + "\n" + "Возраст:" + this.age + "\n");
    }
}
