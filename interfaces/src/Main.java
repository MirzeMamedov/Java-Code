public class Main {
    public static void main(String[] args){
        Customermanager customermanager = new Customermanager(new MySqlCustomerDal());
        customermanager.Add();
    }
}