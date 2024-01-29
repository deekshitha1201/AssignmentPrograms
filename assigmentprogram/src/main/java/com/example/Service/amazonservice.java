package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.Entity.Amazon;
@Component
public interface amazonservice {
	public Amazon add(Amazon a);
	public List<Amazon> getAll();
    public Amazon getbyid(int id);
    public String deletebyid(int id);
	

}
