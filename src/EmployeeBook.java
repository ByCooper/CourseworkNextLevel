import java.text.DecimalFormat;

public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    public void add(Employee item) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = item;
                return;
            }
        }
    }

    public void remove(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                employees[i] = null;
            }
        }
    }

    public void remove(String mName, String fName, String lName) {
        for (int i = 0; i < employees.length; i++) {
            if (fName.equals(employees[i].getFirstName()) && mName.equals(employees[i].getMiddleName()) && lName.equals(employees[i].getLastName())) {
                employees[i] = null;
            }
        }
    }

    public void printAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            } else
                System.out.println("VACATION");
        }
    }

    public void allSalary() {
        int sum = 0;
        int a = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                a = employees[i].getSalary();
                sum = sum + a;
            }
        }
        System.out.println("Ежемесячные расходы на зарплату сотрудников предприятия составляет " + sum + " рублей");
    }

    public void minSalary() {
        int min = employees[0].getSalary();
        Employee unitMin = employees[0];
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (min > employees[i].getSalary()) {
                    min = employees[i].getSalary();
                    unitMin = employees[i];
                }
            }
        }
        System.out.println("Минимальная зарплата по организации: " + "\n" + unitMin);
    }

    public void maxSalary() {
        int max = employees[0].getSalary();
        Employee unitMax = employees[0];
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (max < employees[i].getSalary()) {
                    max = employees[i].getSalary();
                    unitMax = employees[i];
                }
            }
        }
        System.out.println("Максимальная зарплата по организации: " + "\n" + unitMax);
    }

    public void averageSalary(int i) {
        double average = (double) i / employees.length;
        System.out.println("Среднее занчение зарплат равно " + new DecimalFormat("###,###.##").format(average));
    }

    public void allName() {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getMiddleName() + " " + employees[i].getFirstName() + " " + employees[i].getLastName());
            }
        }
    }

    public void indexSalary(int percent) {
        System.out.println("Повышение зарплаты на " + percent + " %");
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * percent / 100));
                System.out.println(employees[i]);
            }
        }
    }

    public void getMinimalSalaryInOffice(int office) {
        int min = 0;
        Employee minU;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (employees[i].getOffice() == office) {
                    min = employees[i].getSalary();
                    break;
                }
            }
        }
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    if (min > employees[j].getSalary()) {
                        min = employees[j].getSalary();
                    }
                }
            }
        }
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (min == employees[i].getSalary() && employees[i].getOffice() == office) {
                    minU = employees[i];
                    System.out.println("Минимальная зарплата в отделе: " + "\n" + minU);
                }
            }
        }
    }

    public void getMaximalSalaryInOffice(int office) {
        int max = 0;
        Employee maxU;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (employees[i].getOffice() == office) {
                    max = employees[i].getSalary();
                    break;
                }
            }
        }
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    if (max < employees[j].getSalary()) {
                        max = employees[j].getSalary();
                    }
                }
            }
        }
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (max == employees[i].getSalary() && employees[i].getOffice() == office) {
                    maxU = employees[i];
                    System.out.println("Максимальная зарплата в отделе: " + "\n" + maxU);
                }
            }
        }
    }

    public void getAllSalaryOffice(int office) {
        int sum = 0;
        int a;
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    a = employees[j].getSalary();
                    sum = sum + a;
                }
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу № " + office + " составляет " + sum + " RUB");
    }

    public void getAverageSalaryOffice(int office) {
        int sum = 0;
        int a;
        int k = 0;
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    a = employees[j].getSalary();
                    sum = sum + a;
                    ++k;
                }
            }
        }
        double averageSalaryOffice = (double) sum / k;
        System.out.println("Средняя зарплата по отделу № " + office + " составляет " + new DecimalFormat("###,###.##").format(averageSalaryOffice) + " RUB");
    }

    public void getIndexSalaryOffice(int office, int percent) {
        System.out.println("Зарплата сотрудников " + office + " отдела, после индексации на " + percent + " %");
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    employees[j].setSalary(employees[j].getSalary() + (employees[j].getSalary() * percent) / 100);
                    System.out.println(employees[j]);
                }
            }
        }
    }

    public void getAllEmployeeOffice(int office) {
        System.out.println("Сотрудники " + office + " отдела:");
        for (int j = 0; j <= employees.length - 1; j++) {
            if (employees[j] != null) {
                if (employees[j].getOffice() == office) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + employees[j].getId() + '\n' +
                            "Фамилия ='" + employees[j].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + employees[j].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + employees[j].getLastName() + '\'' + '\n' +
                            "Зарплата = " + employees[j].getSalary() + '\n');
                }
            }
        }
    }

    public void sourceSalaryOfEmployeeLow(int digit) {
        System.out.println("Сотрудники, чья зарплата меньше " + digit + " рублей");
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < digit) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + employees[i].getId() + '\n' +
                            "Фамилия ='" + employees[i].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + employees[i].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + employees[i].getLastName() + '\'' + '\n' +
                            "Зарплата = " + employees[i].getSalary() + '\n');
                }
            }
        }
    }

    public void sourceSalaryOfEmployeeHigh(int digit) {
        System.out.println("Сотрудники, чья зарплата больше " + digit + " рублей");
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= digit) {
                    System.out.println('\n' + "Сотрудник" + '\n' + "id = " + employees[i].getId() + '\n' +
                            "Фамилия ='" + employees[i].getMiddleName() + '\'' + '\n' +
                            "Имя ='" + employees[i].getFirstName() + '\'' + '\n' +
                            "Отчество ='" + employees[i].getLastName() + '\'' + '\n' +
                            "Зарплата = " + employees[i].getSalary() + '\n');
                }
            }
        }
    }

    public void changeSalary(String mName, String fName, String lName, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (fName.equals(employees[i].getFirstName()) && mName.equals(employees[i].getMiddleName()) && lName.equals(employees[i].getLastName())) {
                employees[i].setSalary(salary);
            }
        }
    }

    public void changeOffice(String mName, String fName, String lName, int office) {
        for (int i = 0; i < employees.length; i++) {
            if (fName.equals(employees[i].getFirstName()) && mName.equals(employees[i].getMiddleName()) && lName.equals(employees[i].getLastName())) {
                employees[i].setOffice(office);
            }
        }
    }

    public void printEmployeeWithOffice() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Список сотрудников " + i + " отдела: ");
            for (int j = 0; j < employees.length; j++) {
                if (employees[j].getOffice() == i) {
                    System.out.println(employees[j].getMiddleName() + " " + employees[j].getFirstName() + " " + employees[j].getLastName());
                }
            }
        }
    }
}
