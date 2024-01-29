package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Amazon;
import com.example.Repository.amazonrepository;
@Service
public class amazonimpservice implements amazonservice {
	@Autowired
	private amazonrepository ar;

	@Override
	public Amazon add(Amazon a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}

	@Override
	public List<Amazon> getAll() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Amazon getbyid(int id) {
		// TODO Auto-generated method stub
		Optional<Amazon> am=ar.findById(id);
		if(am.isPresent())
		{
			return am.get();
		}
		return am.get();
	}

	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		if(ar.existsById(id))
		{
			ar.deleteById(id);
		}
		return "delete";
	}

	
	
	
	

}
