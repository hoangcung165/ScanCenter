package com.platform.scancenter.repository;

import com.platform.scancenter.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TranCung
 * 17/07/2022
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findRoleByRole(String role);
}
