import tr.com.workintech.productForSale.Bread;
import tr.com.workintech.productForSale.Chocolate;
import tr.com.workintech.productForSale.Coke;
import tr.com.workintech.productForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {
 Chocolate chocolate = new Chocolate("Bitter",3,"Sağlıklı",30);
 Coke coke = new Coke("şekersiz",35,"0 şeker",2);
 Bread bread = new Bread("tam buğday",36,"diyete uygun",30);
        ProductForSale[]  prods = {chocolate,coke, bread};
 listProducts(prods);
 ProductForSale[] newProds = new ProductForSale[3];
 newProds[0] = chocolate;
 newProds[1] = coke;
 newProds[2] = bread;
        System.out.println("*********************");
        listProducts(newProds);
    }


    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale p: products){
            p.showDetails();
        }
    }
}