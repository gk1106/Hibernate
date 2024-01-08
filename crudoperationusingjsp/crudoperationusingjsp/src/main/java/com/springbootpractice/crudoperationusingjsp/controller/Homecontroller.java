package com.springbootpractice.crudoperationusingjsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootpractice.crudoperationusingjsp.entity.Laptop;
import com.springbootpractice.crudoperationusingjsp.repo.laptoprepo;


@Controller
public class Homecontroller {
	@Autowired
	private laptoprepo Laptoprepo;
   
	@GetMapping("/home")
	public String home()
	{
		return "index.jsp";
	}
	
	@PostMapping("/savedata")
	public String savedata()

{
    return "data save successfully";	
}
	
	
	@PostMapping("/save")
	public Laptop savedata( Laptop laptop)
	{
		Laptoprepo.save(laptop);
		
		return laptop;
	}
	
	
	@GetMapping("/getone/{id}")
	public Laptop getdetails(@RequestParam int id)
	{
	Optional<Laptop>	lapD=Laptoprepo.findById(id);
	Laptop lapd=lapD.get();
	return lapd;
	}
	@GetMapping("/getall")
	public List<Laptop> getall()
	{
	 List<Laptop>	Laptoplist=Laptoprepo.findAll();
	
	return Laptoplist;
	}
	
	@PutMapping("/update")
	public Laptop update(@RequestBody Laptop laptop)
	{
		Laptoprepo.save(laptop);
		
		return laptop;
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	
	{
	Laptop laptop=Laptoprepo.findById(id).get();
	if(laptop != null)
		Laptoprepo.delete(laptop);
	return "deleted successfully";
		
	}
	
}
