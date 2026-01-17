package CollectionPractise.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Product
{
    private int id;
    private String name;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
        public Product(int id, String name, int price) {
        this.id=id;
        this.name=name;
        this.price=price;


    }
}


public class ListToMap {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList
                (

                        new Product(101, "Laptop", 1500),
                        new Product(102, "Mobile", 15000),
                        new Product(103, "Tablet", 1400)

                );

        Map<Integer , Product>listtomap=products.stream().collect(Collectors.toMap(

                    Product::getId,
                  Function.identity(),
                  (existing,replacement)->replacement



        ));

       // System.out.println(products);
        System.out.println(listtomap);
    }

}
