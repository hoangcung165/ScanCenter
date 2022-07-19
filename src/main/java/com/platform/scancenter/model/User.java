package com.platform.scancenter.model;

import com.platform.scancenter.enumeration.UserStatus;
import lombok.Data;

import javax.persistence.*;

/**
 * TranCung
 * 17/07/2022
 * User Entity
 */
@Table(name = "users")
@Entity
@Data
public class User {

    /**
     * user_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    /**
     * username
     * @length 200
     * @notNull
     */
    @Column(name = "username", length = 200, nullable = false)
    private String username;

    /**
     * password
     * @length 200
     * @notNull
     */
    @Column(name = "password", length = 200, nullable = false)
    private String password;

    /**
     * firstName
     * @length 20
     * @notNull
     */
    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    /**
     * middleName
     * @length 20
     */
    @Column(name = "middle_name", length = 20)
    private String middleName;

    /**
     * lastName
     * @length 20
     * @notNull
     */
    @Column(name = "last_name", length = 20, nullable = false)
    private String lastName;

    /**
     * email
     * @length 150
     */
    @Column(name = "email", length = 150)
    private String email;

    /**
     * status_id
     * @notNull
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status_id", nullable = false)
    private UserStatus status;

    /**
     * role
     */
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
