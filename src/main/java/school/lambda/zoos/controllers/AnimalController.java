package school.lambda.zoos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.lambda.zoos.repositories.AnimalRepository;
import school.lambda.zoos.views.ZooCount;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    AnimalRepository animalrepos;
    //  http://localhost:2019/animals/count
    //  List Animals and how many there are in the db

    @GetMapping(value = "/count")
    public ResponseEntity<?> getAnimalCounts() {
        List<ZooCount> rtnList =  animalrepos.findAnimalZoocount();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

}
