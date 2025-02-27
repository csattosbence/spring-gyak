package eu.dorsum.gyak_app.repository;


import eu.dorsum.gyak_app.model.Product;
import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    public Product findByName(String name);
}
