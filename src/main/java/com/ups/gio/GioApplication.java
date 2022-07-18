package com.ups.gio;

import com.ups.gio.panel.AmqQueueDepthViewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GioApplication {

    public static void main(String[] args) {
        SpringApplication.run(GioApplication.class, args);
    }


}
