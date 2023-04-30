package nehoraii.project.pizzahut.controller;

import nehoraii.project.pizzahut.classUpdate.ConnectionPizzaAndPizzaToppingsUpdate;
import nehoraii.project.pizzahut.server.ConnectionPizzaAndPizzaToppingsServer;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
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
    @PutMapping ("/update")
    private String update(@RequestBody ConnectionPizzaAndPizzaToppingsUpdate update){
        Long Id=null;
        Id=connectionPizzaAndPizzaToppingsServer.getByIdForUpdate(update.getId()).getId();
        connectionPizzaAndPizzaToppingsServer.update(Id,update);
        return "The object with " + Id + " updated";
    }

}
