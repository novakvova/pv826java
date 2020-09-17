package pv826.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pv826.entities.Category;
import pv826.entities.Product;
import pv826.repositories.CategoryRepository;
import pv826.repositories.ProductRespository;
import pv826.services.StorageService;

import javax.servlet.ServletContext;

@Controller
public class ProductController {
    @Autowired
    ServletContext context;
    private final StorageService storageService;


    @Autowired
    private ProductRespository productRespository;

    @Autowired
    private CategoryRepository categoryRepository;

    public ProductController(StorageService storageService) {
        this.storageService = storageService;
    }



    @GetMapping("/product")
    public String home(Model model){
        model.addAttribute("products", productRespository.findAll());
        return ("/product/index");
    }

    @GetMapping("/product/create")
    public String getCategories(Model model){
        model.addAttribute("categories",categoryRepository.findAll());
        return("/product/create");
    }
    @PostMapping("/product/create")
    public String create(Product productModel, Model model){
        Product newProduct=new Product();
        newProduct.setName(productModel.getName());
        newProduct.setPrice(productModel.getPrice());
        newProduct.setDescription(productModel.getDescription());
        productRespository.save(newProduct);
        return("redirect:/product");
    }

}

