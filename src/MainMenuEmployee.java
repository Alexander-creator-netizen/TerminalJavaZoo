import java.util.Scanner;

public class MainMenuEmployee {

    private static String loginInput;
    private static int passwordInput;
    static EmployeeBase base = new EmployeeBase();

    public static void menuEmployee() {
        loginInput = loginInput();

        if (isCheckLogin()) {
            while (true) {
                passwordInput = passwordInput();

                if (isCheckPassword()) {
                    System.out.println("\nВход в личный кабинет выполнен.");
                    departmentPersonalAccount(loginInput, passwordInput);
                    break;
                } else {
                    System.out.println("Введён неверный пароль.\n\t0. Главное меню.\n\t1. Попробовать ещё раз.");
                    Scanner in = new Scanner(System.in);
                    int numberInput = in.nextInt();
                    switch (numberInput) {
                        case 0:
                            MainMenu.startJavaZoo();
                        case 1:
                    }
                }
            }
        } else {
            System.out.println("Введённый логин не зарегистрирован.\n\t0. Главное меню.\n\t1. Попробовать ещё раз.");
            Scanner in = new Scanner(System.in);
            int numberInput = in.nextInt();
            switch (numberInput) {
                case 0:
                    MainMenu.startJavaZoo();
                case 1:
                    menuEmployee();
            }
        }
    }

    private static String loginInput() {
        System.out.print("Введите логин: ");
        Scanner in = new Scanner(System.in);
        String loginInput = in.nextLine();
        return loginInput;
    }

    private static boolean isCheckLogin() {
        boolean checkLog = false;

        for (Employee logEmp : base.getEmployeeBase()) {
            if (logEmp.getLogin().equals(loginInput)) {
                checkLog = true;
            }
        }
        return checkLog;
    }

    private static int passwordInput() {
        System.out.print("Введите пароль: ");
        Scanner in = new Scanner(System.in);
        int passwordInput = in.nextInt();
        return passwordInput;
    }

    private static boolean isCheckPassword() {
        boolean checkPass = false;

        for (Employee passEmp : base.getEmployeeBase()) {
            if (passEmp.getPassword() == passwordInput) {
                checkPass = true;
            }
        }
        return checkPass;
    }

    private static void departmentPersonalAccount(String loginBase, int passwordBase) {
        for(Employee employee : base.getEmployeeBase()) {
            if (loginBase.equals(employee.getLogin()) && passwordBase == employee.getPassword() && employee instanceof Accounting) {
                System.out.println("Привет, " + employee.getLogin() + "! (Департамент: Бухгалтерия.)");
                break;
            } else if (loginBase.equals(employee.getLogin()) && passwordBase == employee.getPassword() && employee instanceof HR) {
                System.out.println("Привет, " + employee.getLogin() + "! (Департамент: HR.)");
                break;
            } else if (loginBase.equals(employee.getLogin()) && passwordBase == employee.getPassword() && employee instanceof Warehouse) {
                System.out.println("Привет, " + employee.getLogin() + "! (Департамент: Склад.)");
                break;
            } else if (loginBase.equals(employee.getLogin()) && passwordBase == employee.getPassword() && employee instanceof WorkingStaff) {
                System.out.println("Привет, " + employee.getLogin() + "! (Департамент: Рабочий персонал.)");
                break;
            } else if (loginBase.equals(employee.getLogin()) && passwordBase == employee.getPassword() && employee instanceof Director) {
                System.out.println("Привет, " + employee.getLogin() + "! (Департамент: Руководитель.)");
                break;
            }
        }
    }
}

