package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Inspection;
import Real_Estate_Management_System.MyProject.Service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Inspection")
public class InspectionController {

    @Autowired
    InspectionService inspectionService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    List<Inspection> getAllInspections(){
        return inspectionService.getAllInspections();

    }
}
