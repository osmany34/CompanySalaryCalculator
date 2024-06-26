import java.time.LocalDate;
public class Employee {
    // Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama metodu
    public double raiseSalary() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int yearsWorked = currentYear - hireYear;

        double raisePercentage;

        // İşe başlama süresine göre maaş artışı belirle
        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.10;
        } else {
            raisePercentage = 0.15;
        }

        double raiseAmount = salary * raisePercentage;
        salary += raiseAmount;

        return raiseAmount;
    }

    // Toplam maaş hesaplama metodu
    public double totalSalary() {
        return salary + bonus() - tax();
    }

    // Çalışan bilgilerini ekrana yazdırma metodu
    public String toString() {
        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + totalSalary() + "\n" +
                "Toplam Maaş : " + (salary + raiseSalary());
    }
}
