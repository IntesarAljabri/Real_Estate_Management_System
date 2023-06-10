package Real_Estate_Management_System.MyProject.Service;

import Real_Estate_Management_System.MyProject.Models.Agent;
import Real_Estate_Management_System.MyProject.Repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    @Autowired
    AgentRepository agentRepository;

    public List<Agent> getAllAgents(){
        return agentRepository.findAll();

    }
}
