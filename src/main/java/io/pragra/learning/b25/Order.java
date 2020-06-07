package io.pragra.learning.b25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    User user;
    ProductList p;
    ShoppingCart cart;

    public Order(User user, ProductList p, ShoppingCart cart) {
        this.user = user;
        this.p = p;
        this.cart = cart;
    }



    public void printOrder(){
        user.printUser();
        cart.checkoutFromCart();
    }
}
