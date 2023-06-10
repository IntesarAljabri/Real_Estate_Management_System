package Real_Estate_Management_System.MyProject.Service;

import Real_Estate_Management_System.MyProject.Models.Appreisal;
import Real_Estate_Management_System.MyProject.Repository.AppresialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppresialService {

    @Autowired
    AppresialRepository appreisalRepository;

    public List<Appreisal> getAllAppreisals(){
        return appreisalRepository.findAll();
    }
}
