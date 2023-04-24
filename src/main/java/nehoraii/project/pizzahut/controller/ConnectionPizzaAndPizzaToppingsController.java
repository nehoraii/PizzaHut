package nehoraii.project.pizzahut.controller;

import nehoraii.project.pizzahut.server.ConnectionPizzaAndPizzaToppingsServer;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
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
    @DeleteMapping("/{id}")
    private String delete(@NotNull @PathVariable("id") Long id){
        return "The object by ID:" + connectionPizzaAndPizzaToppingsServer.delete(id) + "deleted";
    }
}
