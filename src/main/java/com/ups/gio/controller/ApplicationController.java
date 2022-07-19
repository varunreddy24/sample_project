package com.ups.gio.controller;

import com.ups.gio.panel.AmqQueueDepthViewer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ApplicationController {
    private AmqQueueDepthViewer viewer = new AmqQueueDepthViewer();

//    @Autowired
//    public void setAmqDepthViewer(AmqQueueDepthViewer viewer) {
//        this.viewer = viewer;
//    }

    @GetMapping
    public String loadRefreshInterval(Model model){
        model.addAttribute("refreshInterval", viewer.getRefreshInterval());
        return "amq";
    }
}
