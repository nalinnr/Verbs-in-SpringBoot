package io.capgemini.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world-service")                                
public class HelloWorldController {

@RequestMapping("/Hello")
public Info input()
{
return new Info(1,"HelloWorld");
}
}