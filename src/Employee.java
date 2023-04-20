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

//Повышенная сложность ================================================================================================
    public static void indexSalary(Employee[] o, int percent) {
        System.out.println("Повышение зарплаты на " + percent + " %");
        for (int i = 0; i <= o.length - 1; i++) {
            o[i].salary += (o[i].salary * percent / 100);
            System.out.println(o[i]);
        }
    }

    public static void getMinimalSalary(Employee[] o, int office) {
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i].office == office) {
                min = o[i].salary;
                break;
            }
        }
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                if (min > o[j].salary) {
                    min = o[j].salary;
                    minU = o[j];
                }
            }
        }
        for (int i = 0; i <= o.length - 1; i++) {
            if (min == o[i].salary && o[i].office == office) {
                minU = o[i];
            }
        }

        System.out.println("Минимальная зарплата в отделе: " + "\n" + minU);
    }

    public static void getMaximalSalary(Employee[] o, int office) {
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i].office == office) {
                max = o[i].salary;
                break;
            }
        }
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                if (max < o[j].salary) {
                    max = o[j].salary;
                }
            }
        }
        for (int i = 0; i <= o.length - 1; i++) {
            if (max == o[i].salary && o[i].office == office) {
                maxU = o[i];
            }
        }
        System.out.println("Максимальная зарплата в отделе: " + "\n" + maxU);
    }

    public static void getAllSalaryOffice(Employee[] o, int office) {
        int sum = 0;
        int a;
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                a = o[j].salary;
                sum = sum + a;
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу № " + office + " составляет " + sum + " RUB");
    }

    public static void getAverageSalaryOffice(Employee[] o, int office) {
        int sum = 0;
        int a;
        int k = 0;
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                a = o[j].salary;
                sum = sum + a;
                ++k;
            }
        }
        double averageSalaryOffice = (double) sum / k;
        System.out.println("Средняя зарплата по отделу № " + office + " составляет " + new DecimalFormat("###,###.##").format(averageSalaryOffice) + " RUB");
    }

    public static void getIndexSalaryOffice(Employee[] o, int office, int percent) {
        System.out.println("Зарплата сотрудников " + office + " отдела, после индексации на " + percent + " %");
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                o[j].salary += ((double) o[j].salary * percent) / 100;
                System.out.println(o[j]);
            }
        }
    }

    public static void getAllEmployeeOffice(Employee[] o, int office) {
        System.out.println("Сотрудники " + office + " отдела:");
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j].office == office) {
                System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[j].id + '\n' +
                        "Фамилия ='" + o[j].middleName + '\'' + '\n' +
                        "Имя ='" + o[j].firstName + '\'' + '\n' +
                        "Отчество ='" + o[j].lastName + '\'' + '\n' +
                        "Зарплата = " + o[j].salary + '\n');
            }
        }
    }

    public static void sourceSalaryOfEmployeeLow(Employee[] o, int digit) {
        System.out.println("Сотрудники, чья зарплата меньше " + digit + " рублей");
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i].salary < digit) {
                System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[i].id + '\n' +
                        "Фамилия ='" + o[i].middleName + '\'' + '\n' +
                        "Имя ='" + o[i].firstName + '\'' + '\n' +
                        "Отчество ='" + o[i].lastName + '\'' + '\n' +
                        "Зарплата = " + o[i].salary + '\n');
            }
        }
    }

    public static void sourceSalaryOfEmployeeHigh(Employee[] o, int digit) {
        System.out.println("Сотрудники, чья зарплата больше " + digit + " рублей");
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i].salary >= digit) {
                System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[i].id + '\n' +
                        "Фамилия ='" + o[i].middleName + '\'' + '\n' +
                        "Имя ='" + o[i].firstName + '\'' + '\n' +
                        "Отчество ='" + o[i].lastName + '\'' + '\n' +
                        "Зарплата = " + o[i].salary + '\n');
            }
        }
    }

}
