package org.personal.mason.sw.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: domei
 * Date: 12/18/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping(value = {"/","/index","/home"},method = RequestMethod.GET)
    public String home(){
        return "index";
    }
}
