package com.rijai.users.services;
import com.rijai.users.model.Dog;
import java.util.List;

public interface IDogService {
    List<Dog> getDogs();
    Dog getDog(long id);
    Dog addDog(Dog dog);
    Dog updateDog(long id, Dog dog);
    void deleteDog(long id);
}
