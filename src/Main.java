import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
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

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        //employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;


        System.out.println(Arrays.toString(employees));
        System.out.println();
        System.out.println("Ежемесячные расходы на зарплаты для сотрудников составляют " + allSalary(employees));
        System.out.println();
        minSalary(employees);
        System.out.println();
        maxSalary(employees);
        System.out.println();
        averageSalary(employees, allSalary(employees));
        System.out.println();
        allName(employees);
        System.out.println();

//Повышенная сложность =================================================================================================
        indexSalary(employees, 10);
        System.out.println();
        getMinimalSalary(employees, 5);
        System.out.println();
        getMaximalSalary(employees, 2);
        System.out.println();
        getAllSalaryOffice(employees, 2);
        System.out.println();
        getAverageSalaryOffice(employees, 2);
        System.out.println();
        getIndexSalaryOffice(employees, 2, 10);
        System.out.println();
        getAllEmployeeOffice(employees, 4);
        System.out.println();
        sourceSalaryOfEmployeeLow(employees, 17000);
        System.out.println();
        sourceSalaryOfEmployeeHigh(employees, 19000);
    }

    private static int allSalary(Employee[] o) {
        int sum = 0;
        int a = 0;
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                a = o[i].getSalary();
                sum = sum + a;
            }
        }
        return sum;
    }

    private static void minSalary(Employee[] o) {
        int min = o[0].getSalary();
        Employee unitMin = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (min > o[i].getSalary()) {
                    min = o[i].getSalary();
                    unitMin = o[i];
                }
            }
        }
        System.out.println("Минимальная зарплата по организации: " + "\n" + unitMin);
    }

    private static void maxSalary(Employee[] o) {
        int max = o[0].getSalary();
        Employee unitMax = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (max < o[i].getSalary()) {
                    max = o[i].getSalary();
                    unitMax = o[i];
                }
            }
        }
        System.out.println("Максимальная зарплата по организации: " + "\n" + unitMax);
    }

    private static void averageSalary(Employee[] o, int i) {
        double average = (double) i / o.length;
        System.out.println("Среднее занчение зарплат равно " + new DecimalFormat("###,###.##").format(average));
    }

    private static void allName(Employee[] o) {
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                System.out.println(o[i].getMiddleName() + " " + o[i].getFirstName() + " " + o[i].getLastName());
            }
        }
    }

    //Повышенная сложность ================================================================================================
    private static void indexSalary(Employee[] o, int percent) {
        System.out.println("Повышение зарплаты на " + percent + " %");
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                o[i].setSalary(o[i].getSalary() + (o[i].getSalary() * percent / 100));
                System.out.println(o[i]);
            }
        }
    }

    private static void getMinimalSalary(Employee[] o, int office) {
        int min = 0;
        Employee minU;
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (o[i].getOffice() == office) {
                    min = o[i].getSalary();
                    break;
                }
            }
        }
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    if (min > o[j].getSalary()) {
                        min = o[j].getSalary();
                    }
                }
            }
        }
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (min == o[i].getSalary() && o[i].getOffice() == office) {
                    minU = o[i];
                    System.out.println("Минимальная зарплата в отделе: " + "\n" + minU);
                }
            }
        }
    }

    private static void getMaximalSalary(Employee[] o, int office) {
        int max = 0;
        Employee maxU;
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (o[i].getOffice() == office) {
                    max = o[i].getSalary();
                    break;
                }
            }
        }
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    if (max < o[j].getSalary()) {
                        max = o[j].getSalary();
                    }
                }
            }
        }
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (max == o[i].getSalary() && o[i].getOffice() == office) {
                    maxU = o[i];
                    System.out.println("Максимальная зарплата в отделе: " + "\n" + maxU);
                }
            }
        }
    }

    private static void getAllSalaryOffice(Employee[] o, int office) {
        int sum = 0;
        int a;
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    a = o[j].getSalary();
                    sum = sum + a;
                }
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу № " + office + " составляет " + sum + " RUB");
    }

    private static void getAverageSalaryOffice(Employee[] o, int office) {
        int sum = 0;
        int a;
        int k = 0;
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    a = o[j].getSalary();
                    sum = sum + a;
                    ++k;
                }
            }
        }
        double averageSalaryOffice = (double) sum / k;
        System.out.println("Средняя зарплата по отделу № " + office + " составляет " + new DecimalFormat("###,###.##").format(averageSalaryOffice) + " RUB");
    }

    private static void getIndexSalaryOffice(Employee[] o, int office, int percent) {
        System.out.println("Зарплата сотрудников " + office + " отдела, после индексации на " + percent + " %");
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    o[j].setSalary(o[j].getSalary() + (o[j].getSalary() * percent) / 100);
                    System.out.println(o[j]);
                }
            }
        }
    }

    private static void getAllEmployeeOffice(Employee[] o, int office) {
        System.out.println("Сотрудники " + office + " отдела:");
        for (int j = 0; j <= o.length - 1; j++) {
            if (o[j] != null) {
                if (o[j].getOffice() == office) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[j].getId() + '\n' +
                            "Фамилия ='" + o[j].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + o[j].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + o[j].getLastName() + '\'' + '\n' +
                            "Зарплата = " + o[j].getSalary() + '\n');
                }
            }
        }
    }

    private static void sourceSalaryOfEmployeeLow(Employee[] o, int digit) {
        System.out.println("Сотрудники, чья зарплата меньше " + digit + " рублей");
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (o[i].getSalary() < digit) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[i].getId() + '\n' +
                            "Фамилия ='" + o[i].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + o[i].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + o[i].getLastName() + '\'' + '\n' +
                            "Зарплата = " + o[i].getSalary() + '\n');
                }
            }
        }
    }

    private static void sourceSalaryOfEmployeeHigh(Employee[] o, int digit) {
        System.out.println("Сотрудники, чья зарплата больше " + digit + " рублей");
        for (int i = 0; i <= o.length - 1; i++) {
            if (o[i] != null) {
                if (o[i].getSalary() >= digit) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + o[i].getId() + '\n' +
                            "Фамилия ='" + o[i].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + o[i].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + o[i].getLastName() + '\'' + '\n' +
                            "Зарплата = " + o[i].getSalary() + '\n');
                }
            }
        }
    }
}