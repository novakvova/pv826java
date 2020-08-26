package epicentr.repositories;

import epicentr.entities.Gallery;
import epicentr.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ramesh Fadatare
 *
 */
public interface GalleryRepository extends JpaRepository<Gallery, Integer>{

}
