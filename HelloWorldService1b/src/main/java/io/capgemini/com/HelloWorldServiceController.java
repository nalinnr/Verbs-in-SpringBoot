package io.capgemini.com;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world-service")

public class HelloWorldServiceController {
ArrayList<Hello> alllist= new ArrayList<Hello>();        



@RequestMapping(value="/Hello",method=RequestMethod.POST)
public void Helloworldservice(@RequestParam(value="id")int id, @RequestParam(value="name")String name){

	Hello obj=new Hello(id,name);
	alllist.add(obj);
}



@RequestMapping(value="/getallinformation",method=RequestMethod.GET)
public ArrayList<Hello> Helloworldservice1(){
	return alllist;
	
}

}
	
	
	

