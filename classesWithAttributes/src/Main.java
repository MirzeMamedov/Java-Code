public class Main {
    public static void main(String[] args) {
        //product product = new product(1 ,"Asus laptop" ,"device for facilitating daily actions",4999.9 , 10, "blue");

        product product = new product();
        product.setName("Asus laptop");
        product.setId(1);
        product.setDescription("device for facilitating daily actions");
        product.setPrice(4999.9);
        product.setStock_amount(10);
        product.setcolour("blue");
        product_manager pro_ma = new product_manager();
        pro_ma.Adding(product);
        for(int i = 0; i < 10 ; i++){
            if (i % 2 == 0){
                int d = product.getStock_amount();
                product.setStock_amount(d+1);
                System.out.println(d);
            }
        }
    }
}