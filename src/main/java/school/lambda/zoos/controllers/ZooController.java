package school.lambda.zoos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.lambda.zoos.models.Zoo;
import school.lambda.zoos.services.ZooServices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooServices zooServices;
    //  http://localhost:2019/zoos/zoos
    //  lists all zoos with their phone num and animals
    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> getAllZoos() {
        List<Zoo> rtnList = new ArrayList<>();

        zooServices.findAll().iterator().forEachRemaining(rtnList::add);

        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    //  http://localhost:2019/zoos/zoo/5
    //  all info related to a zoo
}
