package Real_Estate_Management_System.MyProject.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;
@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
    Boolean isActive;
    Date createdDate;
    Date updatedDate;
}
