package src.main.java.de.ait_tr.g_36_shop.service.interfaces;

import de.ait_tr.g_36_shop.domain.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    Product save(Product product);
    List<Product> getAllActiveProducts();
    Product getById(Long id);
    Product update(Product product);
    void deleteById(Long id);
    void deleteByTitle(String title);
    void restoreById(Long id);
    long getAllActiveProductsQuantity();
    BigDecimal getAllActiveProductsTotalPrice();
    BigDecimal getAllActiveProductsAveragePrice();
}