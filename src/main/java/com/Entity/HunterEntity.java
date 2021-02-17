package com.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class HunterEntity extends Hunter {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public long getUserId()
    {
        return super.getUserId();
    }

    @Column(name = "name")
    public String getUserName()
    {
        return super.getUserName();
    }

}
