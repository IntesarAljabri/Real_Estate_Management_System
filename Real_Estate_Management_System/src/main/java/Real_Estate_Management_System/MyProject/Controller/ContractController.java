package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Contract;
import Real_Estate_Management_System.MyProject.Service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Contract")
public class ContractController {

    @Autowired
    ContractService contractService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();

    }
}
