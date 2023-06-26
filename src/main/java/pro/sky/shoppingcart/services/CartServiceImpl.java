package pro.sky.shoppingcart.services;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class CartServiceImpl implements CartService {
    private final List<Integer> cart = new ArrayList<>();

    @Override
    public String add(int[] id) {
        for (int i : id) {
            cart.add(i);
        }
        return "Items have been added to card.";
    }

    @Override
    public List<Integer> get() {
        return cart;
    }
}
