package nehoraii.project.pizzahut.controller;

import nehoraii.project.pizzahut.repository.EmployeesRepository;
import nehoraii.project.pizzahut.server.EmployeesServer;
import nehoraii.project.pizzahut.vo.EmployeesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employees")
public class EmployeesController {
    @Autowired
    private EmployeesServer employeesServer;
    @PostMapping("/save")
    private String save(@RequestBody EmployeesVo Vo){
        return employeesServer.save(Vo).toString();
    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody EmployeesVo Vo){
        Long Id = null;
        try {
            Id= employeesServer.getByIDEmployee(Long.valueOf(Vo.getIdOfEmployee())).getId();
            employeesServer.delete(Id);
            return "The object with this ID: " + Id + " deleted";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
