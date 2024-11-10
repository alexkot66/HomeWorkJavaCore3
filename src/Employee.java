public class Employee {
    private String name;
    private double salary;

    /**
     * Конструктор для создания сотрудника с заданным именем и зарплатой.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Пустой конструктор для создания сотрудника без начальных данных.
     */
    public Employee() {

    }

    /**
     * Геттер для получения информации о зарплате сотрудника.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Сеттер для установки новой зарплаты сотруднику.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Переопределение метода для возврата строки с информацией о сотруднике.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        // Преобразуем даты в число, представляющее количество дней
        // Чем меньше число, тем раньше дата
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;

        // Возвращаем результат сравнения чисел
        return Integer.compare(date1, date2);
    }
}
