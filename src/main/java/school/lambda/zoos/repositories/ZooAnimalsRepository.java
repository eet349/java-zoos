package school.lambda.zoos.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.zoos.models.ZooAnimals;
import school.lambda.zoos.models.ZooAnimalsId;

public interface ZooAnimalsRepository  extends CrudRepository<ZooAnimals, ZooAnimalsId> {
}
