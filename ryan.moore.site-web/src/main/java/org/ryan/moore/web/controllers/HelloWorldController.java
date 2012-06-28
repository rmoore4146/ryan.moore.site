package org.ryan.moore.web.controllers;

import com.sun.net.httpserver.HttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.POST)
    public String helloGet(ModelMap map, HttpServletRequest request) {

        String param = request.getParameter("name");

        // this is your model (in future post, I will show how to use the ModelAttribute and command objects)
        if (param == null) {
            map.put("name", "Blah blah blah");
        } else {
            map.put("name", param);
        }
        // for now, this is where your "View" is
        return "helloWorld";
    }
}
