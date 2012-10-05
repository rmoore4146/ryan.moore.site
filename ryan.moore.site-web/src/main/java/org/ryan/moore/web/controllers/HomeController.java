package org.ryan.moore.web.controllers;

import org.ryan.moore.service.exception.ExternalServiceLayerException;
import org.ryan.moore.service.external.fantasynews.api.FantasyNewsService;
import org.ryan.moore.service.external.fantasynews.model.FantasyNews;
import org.ryan.moore.service.external.team.api.TeamLookupService;
import org.ryan.moore.service.external.team.model.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * user: ryan.moore
 * date: 7/1/12
 */
@Controller
public class HomeController {

    private static final String NAME = "Ryan Moore";
    private static final String CITY = "Charleston";

    @Autowired
    private FantasyNewsService fantasyNewsService;

    @Autowired
    private TeamLookupService teamLookupService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homeGet(ModelMap map, HttpServletRequest request) {

        FantasyNews fantasyNews = null;
        List<Teams> teams = null;

        try {
            fantasyNews = fantasyNewsService.loadFantasyNews();
            teams = teamLookupService.loadNFLTeams();
        } catch (ExternalServiceLayerException e) {
            e.printStackTrace();
        }

        map.addAttribute("fantasyNews", fantasyNews);
        map.addAttribute("teams", teams);
        map.addAttribute("name" , NAME);
        map.addAttribute("city", CITY);

        return "home";
    }
}
