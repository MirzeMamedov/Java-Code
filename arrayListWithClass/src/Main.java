import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer name1 = new Customer(1,"name1","surname1");
        Customer name2 = new Customer(2,"name2","surname2");
        Customer name3 = new Customer(3,"name3","surname3");

        customers.add(name1);
        customers.add(name2);
        customers.add(name3);

        customers.remove(name1);

        for (Customer customer : customers) System.out.println(customer.getCustomer());
    }
}