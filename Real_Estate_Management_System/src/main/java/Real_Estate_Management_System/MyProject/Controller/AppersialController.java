package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Appreisal;
import Real_Estate_Management_System.MyProject.Service.AppresialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Appraisal")
public class AppersialController {

    @Autowired
    AppresialService appresialService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Appreisal> getAllAppresials() {
        return appresialService.getAllAppreisals();

    }
}
