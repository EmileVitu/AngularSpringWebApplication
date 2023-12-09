package com.springangularwebapp.canvaswebapp.service;

import com.springangularwebapp.canvaswebapp.exception.CanvasUserNotFoundException;
import com.springangularwebapp.canvaswebapp.model.CanvasUser;
import com.springangularwebapp.canvaswebapp.repository.CanvasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CanvasService {
    private final CanvasRepository canvasRepository;

    @Autowired
    public CanvasService(CanvasRepository canvasRepository) {
        this.canvasRepository = canvasRepository;
    }

    public CanvasUser addCanvasUser(CanvasUser canvasUser) {
        canvasUser.setEmployeeId(UUID.randomUUID().toString());
        return canvasRepository.save(canvasUser);
    }

    public List<CanvasUser> findAllCanvasUsers() {
        return canvasRepository.findAll();
    }

    public CanvasUser updateCanvasUser(CanvasUser canvasUser) {
        return canvasRepository.save(canvasUser);
    }

    public CanvasUser findCanvasUserById(Long id) {
        return canvasRepository.findCanvasUserById(id)
                .orElseThrow(() -> new CanvasUserNotFoundException("CanvasUser by id " + id + "was not found."));
    }

    public void deleteCanvasUser(Long id) {
        canvasRepository.deleteCanvasUserById(id);
    }
}