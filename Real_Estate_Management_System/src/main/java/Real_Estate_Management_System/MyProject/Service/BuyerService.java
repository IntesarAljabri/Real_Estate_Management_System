package Real_Estate_Management_System.MyProject.Service;

import Real_Estate_Management_System.MyProject.Models.Buyer;
import Real_Estate_Management_System.MyProject.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }
}
