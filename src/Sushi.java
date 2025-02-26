public class Sushi {

    //varibles ingredients, type, price, size(number of sushi)
    String ingredient;
    String type;
    double price;
    int size;
    boolean isHot;

public Sushi (double x) {
    ingredient = "Rice, Tuna, Salmon, Carrots, Seaweed, Soy sauce";
    type = "regular";
    price = x;
    size = 5;
    isHot = true;

}

 public void print () {
     System.out.println("ingredients "+ ingredient);
     System.out.println("type "+type);
     System.out.println("price "+price);
     System.out.println("size "+size);
     System.out.println("it is "+isHot+" that it is hot");
 }

}
