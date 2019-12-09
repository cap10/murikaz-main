package com.cap10mycap10.murikazauthserver.controller;


import com.cap10mycap10.murikazauthserver.exception.ResourceNotFoundException;
import com.cap10mycap10.murikazauthserver.pojo.GroupPojo;
import com.cap10mycap10.murikazauthserver.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping(value = "/group")
    public ResponseEntity<Object> getGroups() {

        return new ResponseEntity<>(groupService.getGroups(), HttpStatus.OK);
    }

    @PutMapping(value = "/group/{id}")
    public ResponseEntity<Object> updateGroup(@PathVariable("id") Long id, @RequestBody GroupPojo groupPojo) throws ResourceNotFoundException {
        groupService.updateGroup(id, groupPojo);
        return new ResponseEntity<>("Group updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/group/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        groupService.deleteGroup(id);
        return new ResponseEntity<>("Group deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/group")
    public ResponseEntity<Object> createCountry(@RequestBody GroupPojo groupPojo) {
        groupService.createGroup(groupPojo);
        return new ResponseEntity<>("Group created successfully", HttpStatus.CREATED);
    }


}
