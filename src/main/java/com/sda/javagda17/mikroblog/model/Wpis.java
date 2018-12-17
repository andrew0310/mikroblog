package com.sda.javagda17.mikroblog.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Wpis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tresc;
    
    @CreationTimestamp
    private LocalDateTime dataUtworzenia;
}
