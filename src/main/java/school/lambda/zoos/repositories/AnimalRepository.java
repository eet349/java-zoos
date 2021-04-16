package school.lambda.zoos.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.zoos.models.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
