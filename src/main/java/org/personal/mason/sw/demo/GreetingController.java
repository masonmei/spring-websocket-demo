package org.personal.mason.sw.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: domei
 * Date: 12/18/13
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greetign(HelloMessage message) throws Exception{
        Thread.sleep(1000);
        return new Greeting("Hello, " +  message.getName() + "!");
    }
}
