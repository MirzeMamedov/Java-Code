public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal , IRepository {

    @Override
    public void Add() {
        System.out.println("My Sql has been added");
    }
    public void mysql(){
        System.out.println("mysql");
    }
}
