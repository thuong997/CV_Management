package com.bezkoder.cv_management.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobLevelId implements Serializable {

    private int ticketEntity;
    private int jobEntity;
    private int levelEntity;
}
