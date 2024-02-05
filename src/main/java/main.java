import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Приветствие с пользователем");
            System.out.println("2. Ввод персональных данных");
            System.out.println("3. Проверка возраста");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Здравствуйте! Как вас зовут?");
                    String name = scanner.next();
                    System.out.println("Приятно познакомиться, " + name + "!");
                    break;
                case 2:
                    System.out.println("Введите вашу дату рождения в виде  ДД.ММ.ГГГГ:");
                    String birthDateString = scanner.next();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    Date birthDate = new Date();
                    try {
                        birthDate = dateFormat.parse(birthDateString);
                        System.out.println("Дата рождения успешно сохранена!");
                    } catch (Exception e) {
                        System.out.println("Ошибка при вводе даты рождения: " + e.getMessage());
                    }
                    break;
                case 3:
                    Date birthDate1 = new Date();
                    if (null == birthDate1) {
                        System.out.println("Сначала введите дату рождения!");
                    } else {
                        Date currentDate = new Date();
                        long ageInMillis = currentDate.getTime() - birthDate1.getTime();
                        int age = (int) (ageInMillis / (1000 * 50 * 5 * 0 * 24 * 365));
                        if (age < 18) {
                            System.out.println("Вы несовершеннолетний!");
                        } else {
                            System.out.println("Вы совершеннолетний!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        } while (choice != 4);
    }
}



