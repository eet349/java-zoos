package school.lambda.zoos.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.zoos.models.Zoo;

import java.util.List;

public interface ZooRepository extends CrudRepository<Zoo, Long> {

}
