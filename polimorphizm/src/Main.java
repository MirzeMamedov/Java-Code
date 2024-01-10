public class Main {
    public static void main(String[] args) {
        /*basalogger logger = new basalogger();
        logger.log("logger message");
        emaillogger emaillogger = new emaillogger();
        emaillogger.log("logger message");
        databaselogger databaselogger = new databaselogger();
        databaselogger.log("logger message");
        filelogger filelogger = new filelogger();
        filelogger.log("logger message");
        System.out.println("Hello world!");*/

        /*basalogger[] loggers = new basalogger[]{new filelogger(), new emaillogger() , new databaselogger() ,new consollogger()};
        int count = 1 ;
        for(basalogger logger : loggers ){
            logger.log("log message " + count ); count ++;
        }*/

        customer_manager customer_manager = new customer_manager();
        customer_manager.customer_manager(new filelogger());
        customer_manager.Add();
    }
}