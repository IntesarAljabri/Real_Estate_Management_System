package Real_Estate_Management_System.MyProject.Repository;

import Real_Estate_Management_System.MyProject.Models.Agent;
import Real_Estate_Management_System.MyProject.Models.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
}
