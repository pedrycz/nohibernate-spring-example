package cz.pedry.examplespringapp.entity;

import cz.pedry.examplespringapp.model.Geometry;
import cz.pedry.nohibernate.NoHibernate;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Sprite {

    public Sprite() {
    }

    public Sprite(Geometry geometry) {
        this.geometry = geometry;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Type(type = NoHibernate.Type.BASIC)
    private Geometry geometry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "Sprite{id=" + id + ", geometry=" + geometry + ", area=" + getGeometry().area() + "}";
    }

}
