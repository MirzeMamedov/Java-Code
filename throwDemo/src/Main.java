public class Main {
    public static void main(String[] args) {
        Account_manager accountManager = new Account_manager();
        System.out.println("amount : " + accountManager.getBalance());
        accountManager.deposit(333);
        System.out.println("amount : " + accountManager.getBalance());
        try{
        accountManager.withdraw(3000);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getmessage());
        }
        System.out.println("amount : " + accountManager.getBalance());
        try{
            accountManager.withdraw(33);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getmessage());
        }
        System.out.println("amount : " + accountManager.getBalance());
    }
}