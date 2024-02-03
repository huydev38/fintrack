package com.huyng.fintrack.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class WalletHistoryEntity extends TimeAuditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private WalletEntity wallet;

    private Double lastBalance;

    private Double highestBalance;

    private Double lowestBalance;

    private Date date;

    private Long userId;
}
