package Real_Estate_Management_System.MyProject.Service;
import Real_Estate_Management_System.MyProject.Models.Listing;
import Real_Estate_Management_System.MyProject.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ListingService {
    @Autowired
    ListingRepository listingRepository;

    public List<Listing> getAllListings(){
        return listingRepository.findAll();
    }
}
