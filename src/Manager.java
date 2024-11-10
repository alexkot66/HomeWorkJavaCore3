public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    /**
     * Статический метод для повышения зарплаты всех сотрудников, кроме руководителей.
     */
    public static void raiseSalaryForEmployees(Employee[] employees, double raise) {
        for (Employee employee : employees) {
            // Проверяем, что сотрудник не является руководителем
            if (!(employee instanceof Manager)) {
                double newSalary = employee.getSalary() * (1 + raise / 100);

                // Округляем до двух знаков после запятой
                newSalary = Math.round(newSalary * 100.0) / 100.0;

                employee.setSalary(newSalary);
            }
        }
    }
}
