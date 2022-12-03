import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainMenu {

    public static void startJavaZoo() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy, hh:mm:ss");
        Calendar calendar = new GregorianCalendar(2022, Calendar.JANUARY, 1, 8, 0, 0);

        System.out.print("Приветствуем в JavaZoo!\nАктуальная дата: " + dateFormat.format(calendar.getTime()) +
                ".\n\nВы посетили JavaZoo как:\n\t1. Гость\n\t2. Сотрудник\nВведите 1 или 2: ");

        Scanner in = new Scanner(System.in);
        final int i = in.nextInt();

        switch (i) {
            case 1:
            case 2:
                System.out.println("\nДля дальнейшей работы необходимо указать логин и пароль.");
                MainMenuEmployee.menuEmployee();

        }
    }
}
