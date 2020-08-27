package epicentr.repositories;

import epicentr.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ramesh Fadatare
 *
 */
public interface OrderRepository extends JpaRepository<Order, Long>{

}
