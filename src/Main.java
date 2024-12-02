import static java.lang.Character.toUpperCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // HomeWork 10. String & method
        System.out.println("Домашняя работ 10. Строки и методы");
        System.out.println("");
        //Task 1.
        System.out.println("Задача 1. Строки Ф.И.О.");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("");
        //Task 2.
        System.out.println("Задача 2. Замена строчных букв на заглавные");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Task 3.
        System.out.println("Задача 3. Замена <<ё>> на <<е>>");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Исходное имя - " +fullName);
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace('ё', 'е'));

    }
}
