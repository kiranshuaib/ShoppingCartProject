package io.pragra.learning.b25;

import java.util.ArrayList;
import java.util.List;

public class ProductList{

    private List<Product> productList = new ArrayList<>();

    public ProductList() {
        this.initBookStoreItems();
    }

    public void addProduct(Product p) {
        productList.add(productList.size(), p);
    }

    public void removeProduct(int index) {
        productList.remove(index);
    }

    public void addStock(int stock,int pid){
        for(Product p: productList){
            if(p.getPid() == pid){
               p.setStock(stock);
            }
        }
    }

    public void changePrice(int pid,double price){
        for(Product p: productList){
            if(p.getPid() == pid){
                p.setPrice(price);
            }
        }
    }

    public List<Product> getProductList(){
        return productList;
    }



    public void initBookStoreItems() {
        String [] productNames = {"Head First Java, 2nd Edition\n" +
                "by Kathy Sierra", "Head First Design Patterns: A Brain-Friendly Guide\n" +
                "by Eric Freeman", "Java: A Beginner's Guide, Sixth Edition\n" +
                "by Herbert Schildt"};
        Double [] productPrice = {34.19d, 60.00d, 43.09d};
        Integer [] stock = {4, 11, 9};

        for (int i=0; i < productNames.length; i++) {
            this.productList.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }

    public void printProductList() {
        productList.forEach(System.out::println);
    }

}
