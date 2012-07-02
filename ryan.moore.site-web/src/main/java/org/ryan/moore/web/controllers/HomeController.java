package org.ryan.moore.web.controllers;

import org.ryan.moore.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * user: ryan.moore
 * date: 7/1/12
 */
@Controller
public class HomeController {

    private static final String NAME = "Ryan Moore";
    private static final String CITY = "Charleston";

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homeGet(ModelMap map, HttpServletRequest request) {

        //So - using jQuery tabs we load everything on the front page w/
        //one page context - so load everything nicely
        //TODO-tech_debt change these to utils or use separate controllers
        List<Post> posts = getPosts();

        map.addAttribute("posts", posts);
        map.addAttribute("name" , NAME);
        map.addAttribute("city", CITY);

        return "home";
    }

    private List<Post> getPosts() {

        //TODO-mock
        Post post1 = new Post();
        post1.setCreateDt(new Date());
        post1.setId(1L);
        post1.setLastUpdateDt(new Date());
        post1.setPostTitle("The first...");
        post1.setPostText("This is a test... welcome to my site. This site uses jQuery, Spring " +
                "MVC, Google App Engine, Hibernate, & Maven2. Enjoy its beautifulness.");

        Post post2 = new Post();
        post2.setCreateDt(new Date());
        post2.setId(2L);
        post2.setLastUpdateDt(new Date());
        post2.setPostTitle("The second...");
        post2.setPostText("Just another test.. still mock data - need to make Hibernate " +
                "magic work for me. That is all for now.");

        Post post3 = new Post();
        post3.setCreateDt(new Date());
        post3.setId(2L);
        post3.setLastUpdateDt(new Date());
        post3.setPostTitle("She lied to me...");
        post3.setPostText("Oh, oo-o-oh, come on, ooh, yeah\n" +
                "Well I tried to tell you so (yes, I did)\n" +
                "But I guess you didn't know, as I said the story goes\n" +
                "Baby, now I got the flow\n" +
                "'Cos I knew it from the start\n" +
                "Baby, when you broke my heart\n" +
                "That I had to come again, and show you that I'm real\n" +
                "\n" +
                "RETURN OF THE MACK");

        List<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
