package com.pocs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.pocs.model.Puppy;
import com.pocs.repository.PuppyRepository;

@Service
public class PuppyService {

    private PuppyRepository puppyRepository;

    public PuppyService(PuppyRepository puppyRepository) {
        this.puppyRepository = puppyRepository;
    }

    public List<Puppy> getAllPuppies() {
        return puppyRepository.findAll();
    }

    public Puppy createPuppy(Puppy puppy) {
        return puppyRepository.save(puppy);
    }

}
