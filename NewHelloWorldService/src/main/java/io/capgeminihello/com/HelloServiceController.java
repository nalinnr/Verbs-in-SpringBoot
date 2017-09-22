package io.capgeminihello.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloServiceController {
 private List<HelloWorld> info= new ArrayList<>(Arrays.asList( 
		 
   new HelloWorld("1", "Hello World"),
   new HelloWorld("2", "How you doing?"),                     
   new HelloWorld("3", "Hello Tom")
   ));

 
 
@RequestMapping("/hello-world-service/Hello")
 public List<HelloWorld> getnames1()
 {
  return info;
 }
 



/* @RequestMapping("/hello-world-service/Hello")
 public List<HelloWorld> getnames11(@PathVariable("id") final String id,
 		@RequestBody final HelloWorld name) {
 
	 return info;
 
 
 }*/
 
 @RequestMapping(method=RequestMethod.POST, value="/hello-world-service/Hello")
 public void addName(@RequestBody HelloWorld hello){
         info.add(hello);
  
	 }
 
 @RequestMapping("/hello-world-service/Hello/{id}")
 public HelloWorld getnames(@PathVariable String id){
	
	 for(HelloWorld i:info)
	 System.out.println("in POST"+i.toString());
	 return info.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 
	 
 }

 /*@RequestMapping(value = "/hello-world-service/Hello/{id}", method = RequestMethod.POST)
 public ResponseEntity<HelloWorld> getnew(@PathVariable("id") final String id,
 		@RequestBody final HelloWorld name) {

	 int count=0;
	 System.out.println("Name"+name);
	 for(HelloWorld i:info){
		 if(i.getId().equalsIgnoreCase(name.getId())){
			 i.setName(name.getName());
			 count++;
		 }
	 }
	 
 	
 	if (count == 0) {
 		return new ResponseEntity<HelloWorld>(HttpStatus.INTERNAL_SERVER_ERROR);
 	}
 	
 	return new ResponseEntity<HelloWorld>(name, HttpStatus.OK);
 }
 
 */
 
 

 @RequestMapping(value = "/hello-world-service/Hello/{id}", method = RequestMethod.PUT)
 public ResponseEntity<HelloWorld> update(@PathVariable("id") final String id,
 		@RequestBody final HelloWorld name) {

	 int count=0;
	 System.out.println("Name"+name);
	 for(HelloWorld i:info){
		 if(i.getId().equalsIgnoreCase(name.getId())){
			 i.setName(name.getName());
			 count++;
		 }
	 }
	 
 	
 	if (count == 0) {
 		return new ResponseEntity<HelloWorld>(HttpStatus.INTERNAL_SERVER_ERROR);
 	}
 	
 	return new ResponseEntity<HelloWorld>(name, HttpStatus.OK);
 }
 
 
 
 
 
 
 
 
 
 @RequestMapping(value = "/hello-world-service/Hello/{id}", method = RequestMethod.DELETE)
 public ResponseEntity<?> delete(@PathVariable(value="id") final String id, @RequestBody final HelloWorld pojo ){
	 List<HelloWorld> temp=new ArrayList<>();
	 System.out.println("info.contains(pojo)"+pojo);
	 System.out.println("info.contains(pojo)"+info);
	 System.out.println("!id.equalsIgnoreCase(pojo.getId())"+!id.equalsIgnoreCase(pojo.getId()));
	 if(!id.equalsIgnoreCase(pojo.getId())){
		 return new ResponseEntity<String>("Check your input",HttpStatus.INTERNAL_SERVER_ERROR);
	 }else if(pojo.getId() != null && pojo.getName()!= null){
		 int count=0;
		 for(HelloWorld i:info){
			 
			 if(i.getId().equalsIgnoreCase(pojo.getId())){
				count++;
			 }else {
				 temp.add(i);
			}
		 }
		info=temp;
		System.out.println(info);
		 System.out.println("info.contains(pojo)"+info);
		 

		 
		 if(count == 0){
			 return new ResponseEntity<String>("Check your input",HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 return new ResponseEntity<HelloWorld>(pojo,HttpStatus.OK);
	 }else{
		 return new ResponseEntity<String>("Check your input",HttpStatus.INTERNAL_SERVER_ERROR);
	 }
	 
 }









public ResponseEntity<HelloWorld> getnames1(String string, HelloWorld newget) {
	// TODO Auto-generated method stub
	return null;
}





}
 
 
 

 
 
 
 /*@RequestMapping(value = "/hello-world-service/Hello/{id}", method = RequestMethod.DELETE)
 
 public ResponseEntity<?> delete(@PathVariable("id") final String id,
	 		@RequestBody final HelloWorld temp) {
 
 System.out.println(id);
 System.out.println(temp.getId());
 System.out.println(info.remove(temp));
 Integer v=info.indexOf(temp);
 System.out.println(info.indexOf(temp));
 System.out.println(v);
 if(id.equals(temp.getId()))
 {
  if(v!=null) {
	  info.remove(temp);
	  return new ResponseEntity<HelloWorld>(temp,HttpStatus.OK);
	  }else{
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
 }else{
	 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
 }
	 */
 















 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 





