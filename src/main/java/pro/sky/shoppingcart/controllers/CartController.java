package pro.sky.shoppingcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.services.CartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(int[] id) {
        return cartService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }
}