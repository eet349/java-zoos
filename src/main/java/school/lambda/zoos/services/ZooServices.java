package school.lambda.zoos.services;

import school.lambda.zoos.models.Zoo;

import java.util.List;

public interface ZooServices {
    List<Zoo> findAll();
    Zoo findZooByZooid(long id);
    Zoo save(Zoo zoo);
}
