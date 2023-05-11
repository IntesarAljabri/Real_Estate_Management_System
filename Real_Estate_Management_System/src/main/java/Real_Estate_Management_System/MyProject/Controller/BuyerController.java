package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Buyer;
import Real_Estate_Management_System.MyProject.Service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Buyer")
public class BuyerController {

    @Autowired
    BuyerService buyerService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }
}
