package com.platform.scancenter.model;

import lombok.Data;

import javax.persistence.*;

/**
 * TranCung
 * 17/07/2022
 *  Role Entity
 */
@Entity
@Table(name = "role")
@Data
public class Role {

    /**
     * role_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    /**
     * role
     * @length 20
     * @notNull
     */
    @Column(name = "role", length = 20, nullable = false)
    private String role;

    /**
     * description
     * text
     */
    @Column(name = "description")
    private String description;
}
