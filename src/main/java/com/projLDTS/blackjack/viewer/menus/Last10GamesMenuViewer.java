package com.projLDTS.blackjack.viewer.menus;

import com.projLDTS.blackjack.gui.LanternaGUI;
import com.projLDTS.blackjack.viewer.Viewer;

import java.io.IOException;

public class Last10GamesMenuViewer implements Viewer {
    int buttonSelected;
    private final LanternaGUI gui;

    public Last10GamesMenuViewer(LanternaGUI gui_){
        buttonSelected = 0;
        gui = gui_;
    }

    public int getButtonSelected() {
        return buttonSelected;
    }

    @Override
    public void draw() throws IOException {
        gui.clear();
        gui.drawLast10GamesText();
        drawElements();
        gui.refresh();
    }

    @Override
    public void drawElements() throws IOException {
        gui.drawRetDecks(buttonSelected == 0);
        gui.refresh();
    }


    public void setButtonSelected(int i) {
        buttonSelected = i;
    }
}
