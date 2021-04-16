package school.lambda.zoos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.zoos.models.Animal;
import school.lambda.zoos.repositories.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServicesImpl implements AnimalServices {
    @Autowired
    AnimalRepository animalrepos;

    @Autowired
    UserAuditing userAuditing;

    @Override
    public List<Animal> findAll() {
        List list = new ArrayList();

        animalrepos.findAll().iterator().forEachRemaining(list::add);

        return list;
    }
    @Override
    public Animal save(Animal animal) {

        return animalrepos.save(animal);
    }
}
