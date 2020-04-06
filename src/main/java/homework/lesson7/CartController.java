package homework.lesson7;

import java.io.IOException;

@Controller
public class CartController {
    private ProductRepository productRepository;
    private Cart cart;

    @GetMapping("/cart")
    public String cartForm(Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }

    @GetMapping("/cart/add/{id}")
    public void addProductToCart(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        cart.add(productRepository.findById(id));
        response.sendRedirect(request.getHeader("referer"));
    }

    @GetMapping("/cart/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        cart.removeById(id);
        return "redirect:/cart";
    }

}
