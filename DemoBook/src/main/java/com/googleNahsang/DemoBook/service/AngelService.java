package com.googleNahsang.DemoBook.service;

import com.googleNahsang.DemoBook.entity.Angel;

import java.util.List;

public interface AngelService {
    Angel saveAngel (Angel angel);
    List<Angel> getAllAngel();

}
