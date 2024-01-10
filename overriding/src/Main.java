public class Main {

    public static void main(String[] args) {
        base_credit_manager[] credit_managers = new base_credit_manager[]{
                new teacher_credit_manager(), new farming_credit_manager() , new student_credit_manager()};
        for(base_credit_manager creditManager_ : credit_managers ){
            System.out.println(creditManager_.calculate(1000));
        }
    }
}
