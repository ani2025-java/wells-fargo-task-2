package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfoloId;
    @Id
    @Column(nullable = false)
    private long clientId;
    @Column(nullable = false)
    private Date creationDate;
}
