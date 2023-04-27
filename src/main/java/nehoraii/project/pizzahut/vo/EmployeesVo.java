package nehoraii.project.pizzahut.vo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
@Data
public class EmployeesVo implements Serializable {
    private String idOfEmployee;
    private String name;
    private String secName;
    private String phone;
    private double payForHours;
    private String bankAccountNumber;
    private Date dateOfBirth;


}
