package org.ryan.moore.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * user: ryan.moore
 * date: 6/28/12
 */
@Controller
public class SplashPageController {

    @RequestMapping(value = "/m", method = RequestMethod.GET)
    public String helloGet(ModelMap map, HttpServletRequest request) {

        return "splashPage";
    }
}