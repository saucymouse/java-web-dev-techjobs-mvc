package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController extends TechJobsController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }

}
