package io.pragra.learning.b25;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user =new User();
        ShoppingCart cart = new ShoppingCart();
        ProductList productList = new ProductList();

        /***************ProductList*****************/
        System.out.println("-----------------------------");
        System.out.println("To have a look at the available books in store enter Yes");
        String a = scanner.next();

        if (a.equalsIgnoreCase("yes")) {
            productList.printProductList();
            cart.addProductToCartInterface(productList);
        }else {
            System.out.println("exit");
        }
//



//        cart.addProductsToCartByPid(1);
//        cart.addProductsToCartByPid(2);
//        cart.addProductsToCartByPid(3);

        /***************Shopping Cart List*****************/
//        cart.printCartItem();

        /***************Checkout List*****************/
//        cart.checkoutFromCart();

        System.out.println("Here is your final order");

        Order order = new Order(user,productList,cart);
        order.printOrder();

    }
}
