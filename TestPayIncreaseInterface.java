import com.practicaljava.lesson7.Contractor;
import com.practicaljava.lesson7.Employee;
import com.practicaljava.lesson7.Payable;

public class TestPayIncreaseInterface {

    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        for (Payable p:
             workers) {
            ((Payable)p).increasePay(30);
        }
    }
}
