package Real_Estate_Management_System.MyProject.Service;

import Real_Estate_Management_System.MyProject.Models.Property;
import Real_Estate_Management_System.MyProject.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyService {
    @Autowired
    PropertyRepository propertyRepository;

    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
}
