package com.example.politsei.Service;

import com.example.politsei.Model.Operation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OperationService {

    private final List<Operation> operations = new ArrayList<>();

    public Operation addNumbers(int number1, int number2) {
        Operation operation = new Operation(number1, number2);
        operations.add(operation);
        return operation;
    }

    public List<Operation> queryOperations(Integer number, boolean ascending) {
        List<Operation> filteredOperations = operations.stream()
                .filter(op -> number == null ||
                        op.getNumber1() == number ||
                        op.getNumber2() == number ||
                        op.getSum() == number)
                .sorted(Comparator.comparingInt(Operation::getSum))
                .collect(Collectors.toList());

        if (!ascending) {
            Collections.reverse(filteredOperations);
        }

        return filteredOperations;
    }
}
