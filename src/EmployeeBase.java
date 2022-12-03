import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeBase {

    Employee accountantOne = new Accounting("Зинаида", "Сталлоне", "zinka_stal", 1122);
    Employee accountantTwo = new Accounting("Алефтина", "Шварцнегер", "shvarc", 2211);
    Employee HR_One = new HR("Юлия", "Бабулькина", "krasotka", 1133);
    Employee HR_Two = new HR("Екатерина", "Уволюнах", "superHR", 3311);
    Employee warehouseOne = new Warehouse("Геннадий", "Дохляшкин", "stoikiy", 1144);
    Employee warehouseTwo = new Warehouse("Виктор", "Барыга", "naidet_vse", 4411);
    Employee workerOne = new WorkingStaff("Михаил", "Подметало", "metla", 1155);
    Employee workerTwo = new WorkingStaff("Людок", "Разводилова", "razvod", 5511);
    Employee directorOne = new Director("Александр", "Босс", "boss", 1111);
    Employee directorTwo = new Director("Павел", "Сеньёро", "senor", 2222);

    private ArrayList <Employee> employeeBase = new ArrayList<>(Arrays.asList(accountantOne, accountantTwo, HR_One, HR_Two, warehouseOne, warehouseTwo, workerOne, workerTwo, directorOne, directorTwo));

    public ArrayList<Employee> getEmployeeBase() {
        return employeeBase;
    }
}
