public class customer_manager {
    private basalogger logger;
    public void customer_manager(basalogger logger){
        this.logger = logger;
    }
    public void Add(){
        System.out.println("Customer has been added");
        this.logger.log("log message");
    }
}
