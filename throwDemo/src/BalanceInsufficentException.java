public class BalanceInsufficentException extends Exception{
    String message;

    public BalanceInsufficentException(String message){
        this.message = message;
    }
    public String getmessage(){
        return message;
    }
}
