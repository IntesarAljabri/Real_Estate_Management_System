package Real_Estate_Management_System.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "inspections")
public class Inspection extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String inspectorName;
    //String status;

    @ManyToOne
    @JoinColumn(name = "propertyId" , referencedColumnName = "id")
    Property property;
}
