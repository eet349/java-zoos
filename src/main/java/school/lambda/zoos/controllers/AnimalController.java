package school.lambda.zoos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    //  http://localhost:2019/animals/count
    //  List Animals and how many there are in the db

    @GetMapping(value = "/counts")
    public ResponseEntity<?> getAnimalCounts() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
