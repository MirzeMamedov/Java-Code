public class Customermanager {
    private ICustomerDal customerDal;
    public Customermanager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void Add(){
        customerDal.Add();
    }
}
