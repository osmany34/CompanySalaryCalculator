public class Main {

    // Main metodu ve çalışanlar
    public static void main(String[] args) {
        Employee employee1 = new Employee("Osman", 30000.0, 42, 2023);
        System.out.println("Çalışan 1 : ");
        System.out.println(employee1);

        Employee employee2 = new Employee("Yusuf", 25000.0, 42, 2024);
        System.out.println("\nÇalışan 2 : ");
        System.out.println(employee2);

        Employee employee3 = new Employee("Murat", 50000.0, 40, 2018);
        System.out.println("\nÇalışan 3 : ");
        System.out.println(employee3);
    }
}