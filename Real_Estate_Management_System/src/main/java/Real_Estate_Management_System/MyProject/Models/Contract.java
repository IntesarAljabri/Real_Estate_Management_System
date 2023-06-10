package Real_Estate_Management_System.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @ManyToOne
    @JoinColumn(name = "buyerId", referencedColumnName = "id")
    private Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "agentId", referencedColumnName = "id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "sellerId", referencedColumnName = "id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "propertyId", referencedColumnName = "id")
    private Property property;
}
