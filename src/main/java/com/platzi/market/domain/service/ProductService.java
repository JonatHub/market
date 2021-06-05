package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Optional;

//Clase que sirve de mediador entre el controlador y la capa del repositorio
//Tambien se puede reemplazar por component pero service es mas esfecifico semanticamente
@Service
public class ProductService {


    //Inicializa un objeto de la implementacion de ProductRepository (ProductoRepository)
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct (int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }
    public boolean delete(int productId){
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);

        /*
        if(getProduct(productId).isPresent()){
            productRepository.delete(productId);
            return true;
         else{
            return false
         }

        }

         */
    }



}
