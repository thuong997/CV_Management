package com.bezkoder.cv_management.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobLevelId implements Serializable {

    private int ticketEntity;
    private int jobEntity;
    private int levelEntity;
}
