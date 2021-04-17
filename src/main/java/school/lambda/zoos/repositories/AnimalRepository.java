package school.lambda.zoos.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import school.lambda.zoos.models.Animal;
import school.lambda.zoos.views.ZooCount;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT  animaltype,  animalid, zoocount\n" +
            "FROM animals a JOIN (SELECT animalid as id, count(zooid) as zoocount FROM zooanimals  GROUP BY animalid) as b on a.animalid =  b.id;"
            ,
            nativeQuery = true
    )
    List<ZooCount> findAnimalZoocount();
}

//
//    SELECT a.animaltype animal, count(zooid) zoocount
//        FROM animals a LEFT JOIN zoos z
//        ON a.animalid = z.zooid
//        GROUP BY a.animaltype

//SELECT  animaltype,  animalid, zoocount
//FROM animals a JOIN (SELECT animalid as id count(zooid) as zoocount FROM zooanimals  GROUP BY animalid) as b on a.animalid =  b.id;

//    SELECT animalid, count(zooid) as zoocount FROM ZOOANIMALS JOIN (SELECT animaltypes FROM animals) as animal ON animal.animalid = animalid