package com.framework.Dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rosid on 12/30/2016.
 */
@Controller
@RequestMapping("/Dashboard")
public class DashboardController {
    @RequestMapping(value = {"/","Index"})
    String Index(){
        return "Index";
    }
}
