package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Amazon;
import com.example.Service.amazonservice;

@RestController
public class amazonController {
	@Autowired
	private amazonservice as;
    @PostMapping("/savedata")
    public Amazon create(@RequestBody Amazon a) {
		return as.add(a);
    	
    }
    @GetMapping("/retrive")
    public List<Amazon> retrive()
    {
    	return as.getAll();
    }
    @GetMapping("/{id}")
    public Amazon givebyid(@PathVariable int id)
    {
    	Amazon amz=as.getbyid(id);
		return amz;
    }
    @DeleteMapping("/{id}")
    public String deleterecord(@PathVariable int id)
    {
		return as.deletebyid(id);
    	
    }

}
