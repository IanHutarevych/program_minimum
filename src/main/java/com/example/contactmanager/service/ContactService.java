package com.example.contactmanager.service;

import com.example.contactmanager.entity.Contact;
import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();

    Contact saveContact(Contact contact);
    Contact getContactById(Long id);
    Contact updateContact(Contact contact);
    void deleteContactById(Long id);
}
