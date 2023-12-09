package com.springangularwebapp.canvaswebapp;

import com.springangularwebapp.canvaswebapp.model.CanvasUser;
import com.springangularwebapp.canvaswebapp.service.CanvasService;
import org.aspectj.weaver.tools.cache.CacheBacking;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canvasuser")
public class CanvasUserResource {
    private final CanvasService canvasService;

    public CanvasUserResource(CanvasService canvasService) {
        this.canvasService = canvasService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CanvasUser>> getAllCanvasUsers() {
        List<CanvasUser> canvasUsers = canvasService.findAllCanvasUsers();
        return new ResponseEntity<>(canvasUsers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CanvasUser> getCanvasUser(@PathVariable("id") Long id) {
        CanvasUser canvasUser = canvasService.findCanvasUserById(id);
        return new ResponseEntity<>(canvasUser, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CanvasUser> addCanvasUser(@RequestBody CanvasUser requestCanvasUser) {
        CanvasUser newCanvasUser = canvasService.addCanvasUser(requestCanvasUser);
        return new ResponseEntity<>(newCanvasUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CanvasUser> updateCanvasUser(@RequestBody CanvasUser requestCanvasUser) {
        CanvasUser updatedCanvasUser = canvasService.updateCanvasUser(requestCanvasUser);
        return new ResponseEntity<>(updatedCanvasUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCanvasUser(@PathVariable("id") Long id) {
        canvasService.deleteCanvasUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}