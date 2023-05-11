package Real_Estate_Management_System.MyProject.Repository;

import Real_Estate_Management_System.MyProject.Models.Agent;
import Real_Estate_Management_System.MyProject.Models.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing,Long> {
}
