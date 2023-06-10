package Real_Estate_Management_System.MyProject.Controller;
import Real_Estate_Management_System.MyProject.Models.Agent;
import Real_Estate_Management_System.MyProject.Service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Agent")
public class AgentController {
    @Autowired
    AgentService agentService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Agent> getAllCustomers() {
        return agentService.getAllAgents();

    }
}
