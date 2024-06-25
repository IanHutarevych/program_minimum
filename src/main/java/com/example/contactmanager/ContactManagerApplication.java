package com.example.contactmanager;

import com.example.contactmanager.entity.Contact;
import com.example.contactmanager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ContactManagerApplication.class, args);
    }


    @Autowired
    private ContactRepository contactRepository;
    @Override
    public void run(String... args) throws Exception {


//        Contact contact1 = new Contact("Ioann", "Hutarevych", "vguta@gmail.com");
//        contactRepository.save(contact1);
//
//        Contact contact2 = new Contact("Vlad", "Korolenko", "vkorol@gmail.com");
//        contactRepository.save(contact2);
//
//        Contact contact3 = new Contact("Max", "Hantsaruk", "mhants@gmail.com");
//        contactRepository.save(contact3);
    }
}
