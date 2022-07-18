package com.ups.gio.panel;

import com.ups.gio.abstr.JmxToolPanel;

public class AmqQueueDepthViewer extends JmxToolPanel {
    private final String[] refreshInterval = new String[]{"5", "10", "15", "30", "60"};

    private static final int DETAIL_VIEW_SZ = 6;
    private static final int COMPACT_VIEW_SZ = 4;

//    public AmqQueueDepthViewer() {
//        initialize();
//    }

    public String[] getRefreshInterval(){
        return new String[]{"5", "10", "15", "30", "60"};
    }
}
