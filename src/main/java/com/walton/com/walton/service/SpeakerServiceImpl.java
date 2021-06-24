package com.walton.com.walton.service;

import com.walton.model.Speaker;
import com.walton.repository.HibernateSpeakerRepositoryImpl;
import com.walton.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
