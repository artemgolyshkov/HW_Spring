package pro.sky.shoppingcart.services;

import java.util.List;

public interface CartService {
    String add(int[] id);

    List<Integer> get();

}
