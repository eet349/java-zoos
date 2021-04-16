package school.lambda.zoos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.zoos.models.Zoo;
import school.lambda.zoos.repositories.ZooRepository;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServicesImpl implements ZooServices{
    @Autowired
    private ZooRepository zoorepos;

    @Override
    public List<Zoo> findAll() {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooByZooid(long id) {
        return zoorepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " Not Found!"));
    }

    @Override
    @Transactional
    public Zoo save(Zoo zoo) {
        if(zoo.getTelephones().size() > 0 ) {
            throw new EntityExistsException("Phone numbers are not updated through Zoo.");

        }
        return zoorepos.save(zoo);
    }
}
