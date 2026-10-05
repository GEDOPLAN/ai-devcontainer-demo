package de.gedoplan;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Hello extends PanacheEntity {

    public String message;
}
