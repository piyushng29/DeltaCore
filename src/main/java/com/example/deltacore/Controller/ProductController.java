package com.example.deltacore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.deltacore.Entity.ProductDto;
import com.example.deltacore.Entity.Products;
import com.example.deltacore.Repository.ProductRepository;
import com.example.deltacore.Service.ProductService;



@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping({"","/"})
	public String showProductList(Model model) {
		List<Products> products = productService.getProducts();
		model.addAttribute("products", products);
		return "products/index";
	}
	
	@GetMapping("/create")
	public String showCreatePage(Model model) {
		ProductDto productDto = new ProductDto();
		model.addAttribute("productDto", productDto);
		return "products/CreateProduct";
	}
	
}