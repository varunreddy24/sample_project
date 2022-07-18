package com.ups.gio.controller;

import com.ups.gio.panel.AmqQueueDepthViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    private AmqQueueDepthViewer viewer;

//    @Autowired
//    public void setAmqDepthViewer(AmqQueueDepthViewer viewer) {
//        this.viewer = viewer;
//    }

    @RequestMapping("/refresh")
    public String loadRefreshInterval(Model model){
        model.addAttribute("refreshInterval", viewer.getRefreshInterval());
        return "refreshInterval";
    }
}
