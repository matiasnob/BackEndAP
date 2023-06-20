
package com.apbackend.apbackend.security.repository;

import com.apbackend.apbackend.security.entity.Rol;
import com.apbackend.apbackend.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
