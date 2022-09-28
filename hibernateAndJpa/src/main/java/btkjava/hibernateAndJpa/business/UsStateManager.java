package btkjava.hibernateAndJpa.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import btkjava.hibernateAndJpa.dataAccess.UsStateDal;
import btkjava.hibernateAndJpa.entities.UsState;

@Service
public class UsStateManager implements UsStateService {

    private UsStateDal usStateDal;

    @Autowired
    public UsStateManager(UsStateDal usStateDal) {
        this.usStateDal = usStateDal;
    }

    @Override
    public List<UsState> getAll() {
        // Business codes here ..
        // ...
        // ...
        return this.usStateDal.getAll();
    }

    @Override
    public void add(UsState usState) {
        this.usStateDal.add(usState);          
    }

    @Override
    public void update(UsState usState) {
        this.usStateDal.update(usState);
    }

    @Override
    public void delete(UsState usState) {
        this.usStateDal.delete(usState); 
    }

    @Override
    public UsState getById(int stateId) {
        return this.usStateDal.getById(stateId);
    }
    
}
