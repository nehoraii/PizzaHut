package nehoraii.project.pizzahut.controller;

import nehoraii.project.pizzahut.server.ConnectionPizzaAndPizzaToppingsServer;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
import nehoraii.project.pizzahut.vo.EmployeesVo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@Validated
@RestController
@RequestMapping("/ConnectionPizzaTopping")
public class ConnectionPizzaAndPizzaToppingsController {
    @Autowired
    private ConnectionPizzaAndPizzaToppingsServer connectionPizzaAndPizzaToppingsServer;
    @PostMapping("/save")
    public String save(@RequestBody ConnectionPizzaAndPizzaToppingsVo Vo){
        return connectionPizzaAndPizzaToppingsServer.save(Vo).toString();
    }
    @DeleteMapping("/delete")
    private String delete(@RequestBody ConnectionPizzaAndPizzaToppingsVo Vo){
        Long Id= null;
        try {
            Id = connectionPizzaAndPizzaToppingsServer.getEntityByVo(Vo).getId();
        } catch (IllegalAccessException e) {
            return e.getMessage();
        }
        connectionPizzaAndPizzaToppingsServer.delete(Id);
        return "The object by ID: " + Id + " deleted";
    }

}
