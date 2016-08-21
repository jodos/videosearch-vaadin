package ch.renens.jodos.gui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Theme("valo")
@SpringUI
public class MainUI extends UI {

    private static final Logger logger = LoggerFactory.getLogger(MainUI.class);

    @Override
    protected void init(VaadinRequest request) {
        logger.info("Init method from MainUI");
    }
}
