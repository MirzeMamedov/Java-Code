public class Main {
    public static void main(String[] args) {
        Customer_manager customer_manager = new Customer_manager();
        //customer_manager.databaseManager = new oracle_database_manager();
        customer_manager.databaseManager = new my_sql_database_manager();
        customer_manager.getcustoms();

    }
}