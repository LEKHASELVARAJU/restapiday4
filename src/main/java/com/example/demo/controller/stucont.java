package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Entity; 
import com.example.demo.service.stuser;



@RestController
public class stucont {
	@Autowired
	stuser ss;
	@PostMapping("/")
	public Entity savedet(@RequestBody Entity e)
	{
		return ss.savedetail(e);
	}
	@GetMapping("/")
	public List<Entity> show()
	{
		return ss.showdetail();
	}
	@GetMapping("/{id}")
	public Optional<Entity> getById(@PathVariable int id)
	{
		return ss.showById(id);
	}
	@PutMapping("update/{id}")
	public  String modify(@PathVariable int id,@RequestBody Entity e)
	{
		return ss.update(id,e);
	}
//	@DeleteMapping("delete")
//	public String del(@RequestBody Student ss)
//	{
//		sser.deleteinfo(ss);
//		return "Deleted Successfully";
//	}
	//path variable
	@DeleteMapping("delid/{id}")
		public void deletemyid(@PathVariable int id)
		{
			ss.deleteid(id);
		}
//	@DeleteMapping("delparamid")
//	public void deletemyparamid(@RequestParam int id)
//	{
//		sser.deleteid(id);
//	}
	

}
