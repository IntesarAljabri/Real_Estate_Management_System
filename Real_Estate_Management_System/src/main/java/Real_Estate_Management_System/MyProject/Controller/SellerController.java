package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Seller;
import Real_Estate_Management_System.MyProject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Seller> getAllSellers(){
        return sellerService.getAllSellers();

    }
}
