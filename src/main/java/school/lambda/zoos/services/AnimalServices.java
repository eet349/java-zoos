package school.lambda.zoos.services;

import school.lambda.zoos.models.Animal;

import java.util.List;

public interface AnimalServices {
    List<Animal> findAll();
    Animal save(Animal animal);
}
