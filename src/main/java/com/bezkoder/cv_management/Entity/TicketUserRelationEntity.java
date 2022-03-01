package com.bezkoder.cv_management.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
@IdClass(TicketUserId.class)
@Table(name = "ticket_user")
public class TicketUserRelationEntity extends BaseModel {

    @Id
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private TicketEntity ticketEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
