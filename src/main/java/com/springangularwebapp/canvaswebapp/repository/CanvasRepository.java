package com.springangularwebapp.canvaswebapp.repository;

import com.springangularwebapp.canvaswebapp.model.CanvasUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CanvasRepository extends JpaRepository<CanvasUser, Long> {
    void deleteCanvasUserById(Long id);

    Optional<CanvasUser> findCanvasUserById(Long id);
}