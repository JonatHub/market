package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

//Patron Data Mapper: Cpmvertir o traducir dos objetos que puedan hacer una misma labor (Objetos de dominio y entities)
//Cualquier repositorio que quiera trabajar con productos tenga que implementarlo
public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity); //Productos escazos
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
