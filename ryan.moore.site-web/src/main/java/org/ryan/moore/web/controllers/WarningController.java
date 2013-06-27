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
public class WarningController {

    public static final String DEVILS_URL = "http://devils.nhl.com/";
    public static final String GIANTS_URL = "http://www.giants.com/";
    public static final String KNICKS_URL = "http://www.nba.com/knicks/";
    public static final String YANKS_URL = "http://newyork.yankees.mlb.com/";

    @RequestMapping(value = "/m", method = RequestMethod.GET)
    public String helloGet(ModelMap map, HttpServletRequest request) {

        map.addAttribute("devilsUrl", DEVILS_URL);
        map.addAttribute("giantsUrl", GIANTS_URL);
        map.addAttribute("knicksUrl", KNICKS_URL);
        map.addAttribute("yanksUrl", YANKS_URL);

        return "warning";
    }

}
