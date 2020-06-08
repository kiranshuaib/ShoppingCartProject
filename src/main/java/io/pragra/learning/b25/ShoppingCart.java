package io.pragra.learning.b25;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    List<Product> cartItems = new ArrayList<>();

    public void addToCart(Product product){
        cartItems.add(cartItems.size(),product);
    }

    public void removeCartItemByPid(int pid){
        cartItems.remove(pid);
    }


    public void printCartItem(){
//        for(Product p: cartItems){
//            System.out.println("Shopping Cart Item:  "+ p.getPid() +" " + p);
//        }
        cartItems.forEach(System.out::println);
    }

    public Product getProductByPid(int pid){
        Product prod = null;
        List<Product> products = new ProductList().getProductList();
       for(Product p: products){
           if(p.getPid() == pid){
               prod = p;
           }
       }
       return prod;
    }

    public void addProductsToCartByPid(int pid){
        Product p = getProductByPid(pid);
        addToCart(p);
    }



    public void addProductToCartInterface(ProductList products){
        products.printProductList();
        int choice =-1;
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Please key in the the id of product(pid) you want to buy or 0 to exit");
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    addProductsToCartByPid(1);
                    printCartItem();
                    System.out.println("To checkout press 0");
                }break;
                case 2: {
                    addProductsToCartByPid(2);
                    printCartItem();
                    System.out.println("To checkout press 0");
                }break;
                case 3: {
                    addProductsToCartByPid(3);
                    printCartItem();
                    System.out.println("To checkout press 0");
                }break;
                default:{
                   continue;

                }
            }
        }
    }


    public void checkoutFromCart(){
        double total = 0;
        for(Product p: cartItems){
            double tax = 1.13;
            double priceWithoutTax = p.getPrice();
//           System.out.println(priceWithoutTax);
            double priceAfterTax = p.setPrice(Math.round(priceWithoutTax * tax));
            total = total + priceAfterTax;
            System.out.println("Product Name:" +p.getName());
//            System.out.println("Price before tax:" +p.getPrice());
            System.out.println("Price after Tax: "+ priceAfterTax);
        }
         System.out.println("Total Amount Due after Tax: " +total);


    }


}
