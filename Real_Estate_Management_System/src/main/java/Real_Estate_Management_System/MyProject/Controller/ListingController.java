package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Listing;
import Real_Estate_Management_System.MyProject.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Listing")
public class ListingController {
    @Autowired
    ListingService listingService;
    @RequestMapping(value = "getAll" , method = RequestMethod.GET)
    public List<Listing> getAllListings(){
        return listingService.getAllListings();

    }
}
