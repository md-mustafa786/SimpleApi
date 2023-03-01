package com.example.demoH2.controller;

import com.example.demoH2.model.MyDetails;
import com.example.demoH2.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping("/save")
    public ResponseEntity<String> addDetails(@RequestBody MyDetails details){
        myService.add(details);
        return new ResponseEntity<>("saved", HttpStatus.CREATED);
    }

    @GetMapping("get-all")
    public List<MyDetails> getAll(){
      return myService.getAll();
    }

    @GetMapping("by-id/{id}")
    public MyDetails getByid(@PathVariable Integer id){
        return myService.getById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody MyDetails details, @PathVariable Integer id){
        myService.update(details,id);
        return new ResponseEntity<>("updated",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletebyid(@PathParam("id") Integer id){
        myService.delete(id);
      return new ResponseEntity<>("deleted",HttpStatus.OK);
    }
}
