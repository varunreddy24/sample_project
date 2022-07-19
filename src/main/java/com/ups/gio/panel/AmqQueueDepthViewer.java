package com.ups.gio.panel;

import com.ups.gio.abstr.JmxToolPanel;

import java.util.ArrayList;
import java.util.Arrays;

public class AmqQueueDepthViewer extends JmxToolPanel {
    private ArrayList<String> refreshInterval = new ArrayList<>(Arrays.asList("5", "10", "15", "30", "60"));

    private static final int DETAIL_VIEW_SZ = 6;
    private static final int COMPACT_VIEW_SZ = 4;

    public ArrayList<String> getRefreshInterval() {
        return refreshInterval;
    }

}
