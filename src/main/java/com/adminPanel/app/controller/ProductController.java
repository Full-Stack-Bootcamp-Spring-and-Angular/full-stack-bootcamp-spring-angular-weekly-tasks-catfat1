package com.adminPanel.app.controller;

import com.adminPanel.app.entity.Product;
import com.adminPanel.app.entity.ProductDetails;
import com.adminPanel.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    //show all products
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("productsList", productService.getAll());
        return "homePage";
    }

    /****** Start to Add new product *****/
    @GetMapping("/addProduct")
    public String showAddForm(Model model) {
        Product product = new Product();
        ProductDetails details = new ProductDetails();
        product.setDetails(details);
        model.addAttribute("productModel", product);
        return "addProductForm";
    }

    @PostMapping("/processAddProduct")
    public String addProduct(@ModelAttribute("productModel") Product product) {
        ProductDetails details = product.getDetails();
        if (details != null) {
            details.setProduct(product);
            details.setName(product.getName());
        }
        productService.save(product);
        return "redirect:/";
    }
    /****** End to Add new product *****/


    /****** Start to View product  Details *****/
    @PostMapping("/view")
    public String viewDetails(@RequestParam int id, Model model) {
        model.addAttribute("productModel", productService.getById(id));
        return "viewDetailsPage";
    }
    /****** End to View product  Details *****/


    /****** Start update product *****/
    @PostMapping("/updateProduct")
    public String updateView(@RequestParam int id, Model model) {
        Product product = productService.getById(id);
        model.addAttribute("productModel", product);
        return "updateDetailsForm";
    }
    @PostMapping("/processUpdateProductForm")
    public String updateForm(@ModelAttribute("productModel") Product product) {

        Product dbProduct = productService.getById(product.getId());
        // Update product fields
        dbProduct.setName(product.getName());
        // Update details safely
        ProductDetails dbDetails = dbProduct.getDetails();

        if (dbDetails != null && product.getDetails() != null) {

            dbDetails.setExpirationDate(
                    product.getDetails().getExpirationDate());

            dbDetails.setManufacturer(
                    product.getDetails().getManufacturer());

            dbDetails.setPrice(
                    product.getDetails().getPrice());

            dbDetails.setAvailable(
                    product.getDetails().isAvailable());

            dbDetails.setName(dbProduct.getName()); // if needed
        }
        productService.update(dbProduct);
        return "redirect:/";
    }
    /****** End update product *****/


    /****** Start Delete product *****/
    @PostMapping("/deleteProduct")
    public String delete(@RequestParam int id) {
        productService.delete(id);
        return "redirect:/";
    }
    /****** End Delete product *****/

}
