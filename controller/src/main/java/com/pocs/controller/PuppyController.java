package com.pocs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pocs.controller.dto.PuppyDTO;
import com.pocs.model.Puppy;
import com.pocs.service.PuppyService;

@RestController
@RequestMapping(value = "/puppies")
public class PuppyController {

    private PuppyService puppyService;

    public PuppyController(PuppyService puppyService) {
        this.puppyService = puppyService;
    }

    @GetMapping
    public List<Puppy> getAllPuppies() {
        return puppyService.getAllPuppies();
    }

    @PostMapping
    public Puppy createPuppy(@RequestBody PuppyDTO puppyDTO) {
        return puppyService.createPuppy(new Puppy(puppyDTO.getName(), puppyDTO.getAge()));
    }
}
