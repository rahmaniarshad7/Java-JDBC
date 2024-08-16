package StreamAPI_Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"HP Laptop",25000));
        productList.add(new Product(2,"Dell Laptop",30000));
        productList.add(new Product(2,"Lenovo Laptop",28000));
        productList.add(new Product(2,"Asus Laptop",28000));
        productList.add(new Product(2,"MacBook Laptop",90000));

        productList.stream().filter(p -> p.price > 25000).forEach(p -> System.out.println(p.price));
        System.out.println();


    }
}
class Product{
    int id;
    String name;
    double price;

    public Product(int id , String name , double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
}
