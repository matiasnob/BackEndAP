
package com.apbackend.apbackend.repository;

import com.apbackend.apbackend.model.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHySRepository extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}