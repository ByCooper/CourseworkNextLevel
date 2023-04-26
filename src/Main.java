
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иван", "Иванов", "Сергеевич", 2, 19000);
        Employee employee2 = new Employee("Егор", "Петров", "Ильич", 1, 18000);
        Employee employee3 = new Employee("Илья", "Серов", "Александрович", 5, 13000);
        Employee employee4 = new Employee("Игнат", "Нилов", "Иванович", 3, 16000);
        Employee employee5 = new Employee("Игорь", "Валов", "Николаевич", 4, 20000);
        Employee employee6 = new Employee("Сергей", "Шинов", "Андреевич", 2, 15500);
        Employee employee7 = new Employee("Дмитрий", "Сергеев", "Олегович", 4, 19000);
        Employee employee8 = new Employee("Николай", "Цой", "Артемович", 5, 14000);
        Employee employee9 = new Employee("Тимофей", "Тян", "Дмитриевич", 3, 15200);
        Employee employee10 = new Employee("Владимир", "Вашин", "Сергеевич", 2, 18000);
        Employee employee11 = new Employee("Ефим", "Чаркин", "Имхотепович", 1, 35000);

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add(employee1);
        employeeBook.add(employee2);
        employeeBook.add(employee3);
        employeeBook.add(employee4);
        employeeBook.add(employee5);
        employeeBook.add(employee6);
        employeeBook.add(employee7);
        employeeBook.add(employee8);
        employeeBook.add(employee9);
        employeeBook.add(employee10);

        employeeBook.printAll();
        System.out.println();
        employeeBook.allSalary();
        System.out.println();
        employeeBook.remove(7);
        System.out.println();
        employeeBook.add(employee11);
        employeeBook.changeSalary("Тян", "Тимофей", "Дмитриевич", 26000);
        System.out.println();
        employeeBook.changeOffice("Тян", "Тимофей", "Дмитриевич", 5);
        System.out.println();
        employeeBook.remove( "Цой", "Николай", "Артемович");
        System.out.println();
        employeeBook.printAll();
        System.out.println();
        employeeBook.getAllEmployeeOffice(2);
        System.out.println();
        employeeBook.getMaximalSalaryInOffice(2);
        employeeBook.printEmployeeWithOffice();
    }
}