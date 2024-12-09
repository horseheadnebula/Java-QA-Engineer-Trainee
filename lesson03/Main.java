

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович", "Су-шеф", "sergey@mail.com", "89991234567", 90000, 33);
        employeeArray[1] = new Employee("Петрова Надежда Сергеевна", "Повар", "nadya@mail.com", "89991234568", 65000, 22);
        employeeArray[2] = new Employee("Сидоров Георгий Андреевич", "Повар", "zhora@mail.com", "89991234569", 65000, 23);
        employeeArray[3] = new Employee("Смирнов Михаил Алексеевич", "Помощник повара", "misha@mail.com", "89991234560", 55000, 19);
        employeeArray[4] = new Employee("Кузнецова Галина Петровна", "Мойщица", "petrovna@mail.com", "89991234561", 45000, 52);

        for (int i = 0; i < 5; i++) {
            employeeArray[i].getEmployeeInfo();
        }
    }
}

