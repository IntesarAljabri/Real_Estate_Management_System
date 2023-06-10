package Real_Estate_Management_System.MyProject.Service;
import Real_Estate_Management_System.MyProject.Models.Contract;
import Real_Estate_Management_System.MyProject.Repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    ContractRepository contractRepository;

    public List<Contract>getAllContracts(){
        return contractRepository.findAll();
    }
}
