package com.vishnu.rest.quries;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vishnu.rest.quries.model.Person;

@Controller
public class SampleRest {

  @RequestMapping("dosomething")
  public String doSomething(ModelMap model) {
    model.addAttribute("message", "Do Something wonderful");
    return "start";
  }
  
  @RequestMapping(value = "rest", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @ResponseBody
  public Person sampleRest(){
    Person person = new Person();
    person.setFirstName("Vishnu");
    person.setLastName("lname");
    person.setAge(25);
    
    return person;
  }

}
