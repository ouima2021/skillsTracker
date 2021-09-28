package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class skillsController {
    @GetMapping
    public String skillsTracker(){
        return "<html><body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Here are a few programming languages: </h2>" +
                "<ol> <li> Java </li>" +
                     "<li> JavaScript </li>" +
                     "<li> Python </li>"  +
                " </html></body>";
    }

    @GetMapping("form")
    public String formTracker(){
        return "<html><body>" +
                 "<form method='post'>" +
                "<label>Name: </label>" + "<input type = 'text' name='name'/>" + "<br>" +
                "<label>My Favorite Language </label>" + "<select name='favoriteLanguage'>" +
                "<option value='Java'>Java</option>" + "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" + "</select>" + "<br>" +
                "<label>My Second Favorite Language </label>" + "<select name='secondFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" + "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" + "</select>" + "<br>" +
                "<label>My Third Favorite Language </label>" + "<select name='thirdFavoriteLanguage'>" +
                "<option value='Java'>Java</option>" + "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" + "</select>" + "<br>" +
                "<input type='submit'>" + "</form>" +
                " </html></body>";
    }
    @PostMapping("form")
    public String postMapFormTrack(@RequestParam String name, @RequestParam String favoriteLanguage,
                                   @RequestParam String secondFavoriteLanguage,
                                   @RequestParam String thirdFavoriteLanguage) {
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol> <li>" + favoriteLanguage + "</li>" +
                "<li>" + secondFavoriteLanguage + "</li>" +
                "<li>" + thirdFavoriteLanguage + "</li>"  +
                " </html></body>";
    }
}

