package io.capgeminihello.com;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/*public class testexe extends Test2{

	@Autowired
	private WebApplicationContext webApplicationContext;


	private MockMvc mockMvc;

	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	
		@Test
		public void getnames1() throws Exception {
			mockMvc.perform(get("/hello-world-service/Hello")).andExpect(status().isOk())
					.andExpect(content().contentType("application/json;charset=UTF-8"))
					.andExpect(jsonPath("$[0].id").value("1"))
					.andExpect(jsonPath("$[0].name").value("Hello World"));
					
		}
		
		@Test
		public void delete1() throws Exception {
			mockMvc.perform(delete("/hello-world-service/Hello/")).andExpect(status().isOk())
					.andExpect(content().contentType("application/json;charset=UTF-8"))
					.andExpect(jsonPath("$[0].id").value("2"))
					.andExpect(jsonPath("$[0].name").value("How you doing?"));
					
		}	
		
		
	
}
*/


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testexe{

	private HelloServiceController controller = new HelloServiceController();

    private static Map<Integer, HelloWorld> hw = new HashMap<>();
    private List<HelloWorld> rg = new ArrayList<>();
    

    @Test
    public void testGet() {
        HelloServiceController testcase = new HelloServiceController();
        assertEquals(Arrays.asList("Hello World", "How you doing?", "Hello Tom"), testcase.getnames1());
    }

    
    @Test
    public void testUpdate() throws Exception {

        HelloWorld newupdate = new HelloWorld("2" , "newmessage");

      
        ResponseEntity<HelloWorld> responseEntity = controller.update("1", newupdate);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("newmessage", ((HelloWorld)responseEntity.getBody()).getName());

    }

    /*@Test
    public void testpost() throws Exception {

        HelloWorld newpost = new HelloWorld("4" , "Hiiii");

      
        ResponseEntity<HelloWorld> responseEntity = controller.getnew("5", newpost);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("Hiiii", ((HelloWorld)responseEntity.getBody()).getName());

    }
    


    
   
   /* @Test
    public void testDelete() throws Exception {

        HelloWorld newdelete = new HelloWorld("4" , "Blah");
        ResponseEntity<?> responseEntity = controller.delete("2", newdelete);

        Assert.assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
*/
 
    @Test
    public void testRemove() {
        HelloServiceController testrem = new HelloServiceController();
        assertEquals(Arrays.asList("1","Hello World"), testrem.getnames1());
    }
    
}



