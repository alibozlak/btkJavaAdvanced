package btkjava.hibernateAndJpa.dataAccess;

import java.util.List;

import btkjava.hibernateAndJpa.entities.UsState;

public interface UsStateDal {

    List<UsState> getAll();

    void add(UsState usState);

    void update(UsState usState);

    void delete(UsState usState);

    UsState getById(int stateId);

}
