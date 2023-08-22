package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity;
import com.example.demo.repository.stuRep;



@Service
public class stuser {
	@Autowired
       stuRep sr;
	public Entity savedetail(Entity e)
	{
		return sr.save(e);
	}
	public List<Entity> showdetail()
	{
		return sr.findAll();
	}
	public Optional<Entity> showById(int id)
	{
		return sr.findById(id);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
//	public void deletepid(int id)
//	{
//		sr.deleteById(id);
//	}
	public String update(int id,Entity e)
	{
		sr.saveAndFlush(e);
		if(sr.existsById(id))
		{
			return "updtaed";
		}
		else
			
		return "Invalid input";
	}
	
	
       
}
