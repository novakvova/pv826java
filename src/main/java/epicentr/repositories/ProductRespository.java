package epicentr.repositories;


import epicentr.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {
}
