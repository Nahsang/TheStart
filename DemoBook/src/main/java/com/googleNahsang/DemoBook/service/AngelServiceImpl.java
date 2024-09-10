package com.googleNahsang.DemoBook.service;

import com.googleNahsang.DemoBook.entity.Angel;
import com.googleNahsang.DemoBook.repository.AngelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngelServiceImpl implements AngelService{


    private AngelRepository angelRepository;

    public AngelServiceImpl(AngelRepository angelRepository){
        this.angelRepository = angelRepository;

    }


    @Override
    public Angel saveAngel(Angel angel) {
        return angelRepository.save(angel);
    }

    @Override
    public List<Angel> getAllAngel() {
        return angelRepository.findAll();
    }
}
