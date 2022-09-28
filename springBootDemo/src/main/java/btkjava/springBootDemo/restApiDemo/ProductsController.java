package btkjava.springBootDemo.restApiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// MVC (Model View Controller) Deseni :
// Gelen isteği back-endte ilk karşılayan Controller.
// Controller View'a yönlendiriyor. View, işin HTML tarafları.
// Model : View ile Controller arasında gidip gelen data.

// Rest API'da JSON standardı var. Bu standart sayesinde çoklu front-end'e hizmet verebiliyoruz.

@RestController
public class ProductsController {

    @GetMapping("/")
    public String get() {
        return "Laptop 2, devTools deneme";
    }

    @GetMapping("/products")
    public String get2() {
        return "products ile ürünler getirildi.";
    }
}
