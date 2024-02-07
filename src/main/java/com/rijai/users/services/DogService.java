package com.rijai.users.services;

import com.rijai.users.repositry.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rijai.users.model.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DogService implements IDogService {

    @Autowired
    private DogRepository dogRepository;
    @Override
    public List<Dog> getDogs(){
        List<Dog> allDogs = new ArrayList<>();
        dogRepository.findAll().forEach(allDogs::add);

        return allDogs;
    }
    @Override
    public Dog getDog(long id) {
        Optional<Dog> dog = dogRepository.findById(id);

        if(dog.isPresent()) return dog.get();

        return null;
    }
    @Override
    public Dog addDog(Dog dog) {
        return dogRepository.save(dog);
    }
    @Override
    public Dog updateDog(long id, Dog dog) {
        return dogRepository.save(dog);
    }
    @Override
    public void deleteDog(long id) {
        dogRepository.deleteById(id);
    }
}
