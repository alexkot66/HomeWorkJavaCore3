public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Roman employee", 45000);
        Employee emp2 = new Employee("Kirill employee", 60000);
        Manager manager = new Manager("Alexandr Manager", 80000);

        Employee[] employees = {emp1, emp2, manager};

        System.out.println("До повышения зарплаты:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Повышение зарплат всем сотрудникам на 20%, кроме руководителей
        Manager.raiseSalaryForEmployees(employees, 20);

        System.out.println("\nПосле повышения зарплаты:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        int result = emp1.compareDates(2024, 11, 10, 2022, 11, 1);
        System.out.println("Результат сравнения дат: " + result + "\n");

    }


}
