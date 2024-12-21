package structural.decorator.icecream;

public class IceCream {
    public String description;
    public int price;

    public IceCream(String description, int price) {
        this.description = description;
        this.price = price;
    }
     public IceCream(IceCream iceCream){

     }

    public String description() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }
}
