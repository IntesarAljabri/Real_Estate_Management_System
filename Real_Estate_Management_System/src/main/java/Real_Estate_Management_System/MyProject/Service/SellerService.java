package Real_Estate_Management_System.MyProject.Service;
import Real_Estate_Management_System.MyProject.Models.Seller;
import Real_Estate_Management_System.MyProject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

}
