package com.bezkoder.cv_management.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketUserId implements Serializable {

    private int ticketEntity;
    private int userEntity;
}
