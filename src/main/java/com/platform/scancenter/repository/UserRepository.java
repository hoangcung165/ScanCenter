package com.platform.scancenter.repository;

import com.platform.scancenter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TranCung
 * 17/07/2022
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * findUserByUsername
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
