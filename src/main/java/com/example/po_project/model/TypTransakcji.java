package com.example.po_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypTransakcji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
