package com.example.service;
import com.example.entity.Contact;

import java.util.List;

public interface ContactService {
    Iterable<Contact> findAll();
    List<Contact> search(String term);
    Contact findOne(Integer id);
    void save(Contact contact);
    void delete(Integer id);
}
