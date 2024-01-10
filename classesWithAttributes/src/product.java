public class product {
    public product(int id ,String name ,String description ,double price , int stock_amount , String colour) {
        System.out.println("Constructor has been worked");
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock_amount = stock_amount;
        this.name = name;
        this.colour = colour;
    }
    public product() {
    }
    // attribute | field
    private int id ;
    public String name ;
    private String description;
    private double price;
    private int stock_amount;
    private String colour;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock_amount() {
        return stock_amount;
    }

    public void setStock_amount(int stock_amount) {
        this.stock_amount = stock_amount;
    }

    public String setcolour(String colour){
        return this.colour = colour;
    }
}
