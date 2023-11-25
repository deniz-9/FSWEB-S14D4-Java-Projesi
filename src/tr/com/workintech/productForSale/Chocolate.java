package tr.com.workintech.productForSale;

public class Chocolate extends ProductForSale{
    private int gram;
    public Chocolate(String type, double price, String description,int gram) {
        super(type, price, description);
        this.gram = gram;
    }



    @Override
    public void showDetails() {
        System.out.println("Type: " + getType()
                + "\n Price: "+ getPrice()
                + "\n Description: " + getDescription()
                +"\n Gramaj: " + gram);
    }
}
