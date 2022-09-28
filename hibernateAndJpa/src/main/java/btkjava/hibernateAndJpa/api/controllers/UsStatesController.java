package btkjava.hibernateAndJpa.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import btkjava.hibernateAndJpa.business.UsStateService;
import btkjava.hibernateAndJpa.entities.UsState;

@RestController
@RequestMapping("/api/usStates")
public class UsStatesController {

    private UsStateService usStateService;

    @Autowired
    public UsStatesController(UsStateService usStateService) {
        this.usStateService = usStateService;
    }

    @GetMapping("/getAll")
    public List<UsState> getAll() {
        return this.usStateService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody UsState usState) {
        this.usStateService.add(usState);
    }

    // @PostMapping("/update")
    @PutMapping("/update")
    public void update(@RequestBody UsState usState) {
        this.usStateService.update(usState);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody UsState usState) {
        this.usStateService.delete(usState);
    }

    @GetMapping("/getById/{stateId}")
    public UsState getById(@PathVariable int stateId) {
        return this.usStateService.getById(stateId);
    }

}
