package com.example.politsei.Controller;


import com.example.politsei.Model.Operation;
import com.example.politsei.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationController {

    private final OperationService additionService;

    @Autowired
    public OperationController(OperationService additionService) {
        this.additionService = additionService;
    }

    @GetMapping("/add")
    public Operation add(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return additionService.addNumbers(number1, number2);
    }

    @GetMapping("/query")
    public List<Operation> query(@RequestParam(value = "queryNumber", required = false) Integer queryNumber,
                                 @RequestParam("ascending") boolean ascending) {
        return additionService.queryOperations(queryNumber, ascending);
    }
}
