package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Property;
import Real_Estate_Management_System.MyProject.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Property")
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();

    }
}
