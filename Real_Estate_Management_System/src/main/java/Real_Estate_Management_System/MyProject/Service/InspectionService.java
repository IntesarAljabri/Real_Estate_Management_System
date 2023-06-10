package Real_Estate_Management_System.MyProject.Service;
import Real_Estate_Management_System.MyProject.Models.Inspection;
import Real_Estate_Management_System.MyProject.Repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionService {
    @Autowired
    InspectionRepository inspectionRepository;

    public List<Inspection> getAllInspections(){
        return inspectionRepository.findAll();
    }
}
