import java.text.DecimalFormat;
import java.util.Arrays;

public class Employee {
    String firstName;
    String middleName;
    String lastName;
    int office;
    int salary;
    int id;
    public static int count;
//Для задания повышенной сложности ================================================================================
    static int min;
    static Employee minU;
    static int max;
    static Employee maxU;



    public Employee(String fName, String mName, String lName, int office, int salary) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.office = office;
        this.salary = salary;
        id = ++count;

    }

    @Override
    public String toString() {
        return '\n' + "Сотрудник" + '\n' + "id = " + id + '\n' +
                "Фамилия ='" + this.middleName + '\'' + '\n' +
                "Имя ='" + this.firstName + '\'' + '\n' +
                "Отчество ='" + this.lastName + '\'' + '\n' +
                "Отдел = " + this.office + '\n' +
                "Зарплата = " + this.salary + '\n';
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getOffice() {
        return office;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static int allSalary(Employee[] o) {
        int sum = 0;
        int a = 0;
        for (int i = 0; i <= o.length - 1; i++) {
            a = o[i].salary;
            sum = sum + a;
        }
        return sum;
    }

    public static void minSalary(Employee[] o) {
        int min = o[0].salary;
        Employee unitMin = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (min > o[i].salary) {
                min = o[i].salary;
                unitMin = o[i];
            }
        }
        System.out.println("Минимальная зарплата по организации: " + "\n" + unitMin);
    }

    public static void maxSalary(Employee[] o) {
        int max = o[0].salary;
        Employee unitMax = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (max < o[i].salary) {
                max = o[i].salary;
                unitMax = o[i];
            }
        }
        System.out.println("Максимальная зарплата по организации: " + "\n" + unitMax);
    }

    public static void averageSalary(Employee[] o, int i) {
        double average = (double) i / o.length;
        System.out.println("Среднее занчение зарплат равно " + new DecimalFormat("###,###.##").format(average));
    }

    public static void allName(Employee[] o) {
        for (int i = 0; i <= o.length - 1; i++) {
            System.out.println(o[i].middleName + " " + o[i].firstName + " " + o[i].lastName);
        }
    }

}
