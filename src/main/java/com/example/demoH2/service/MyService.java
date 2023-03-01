package com.example.demoH2.service;

import com.example.demoH2.model.MyDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {

    List<MyDetails>   list = new ArrayList<>();
    public void add(MyDetails details) {
       list.add(details);
    }

    public List<MyDetails> getAll() {
        return list;
    }

    public MyDetails getById(Integer id) {
        MyDetails details = null;
        for(MyDetails myDetails:list){
            if(myDetails.getId()==id){
                details=myDetails;
                break;
            }
        }
        return details;
    }

    public void update(MyDetails details, Integer id) {
        for(MyDetails myDetails:list){
            if(myDetails.getId()==id){
                myDetails.setName(details.getName());
                myDetails.setEmail(details.getEmail());
                myDetails.setGender(details.getGender());
                myDetails.setPhoneNumber(details.getPhoneNumber());

            }
        }
    }

    public void delete(Integer id) {
        for(MyDetails myDetails:list){
            if (myDetails.getId()==id){
                list.remove(myDetails);
            }
        }
    }
}
