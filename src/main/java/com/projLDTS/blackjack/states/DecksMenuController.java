package com.projLDTS.blackjack.states;

import com.projLDTS.blackjack.controller.menu.ApplicationStateController;
import com.projLDTS.blackjack.gui.LanternaGUI;
import com.projLDTS.blackjack.gui.UserInput;
import com.projLDTS.blackjack.viewer.menus.DecksMenuViewer;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class DecksMenuController implements StateController {
    private ApplicationStateController applicationStateController;
    public DecksMenuController(ApplicationStateController applicationStateController_) throws IOException, FontFormatException, URISyntaxException {
        applicationStateController = applicationStateController_;
    }

    @Override
    public void run() throws IOException, FontFormatException, URISyntaxException {
        while (true) {
            int aux = userInput();
            if (aux == 4) {
                nextState();
                break;
            }
            else setButtonSelected(aux);
            applicationStateController.redraw();
        }
    }

    @Override
    public void nextState() throws IOException, FontFormatException, URISyntaxException {
        if (getButtonSelected() == 0) {
            //One Deck game
            applicationStateController.changeState(ApplicationState.Game);
        }
        else if (getButtonSelected() == 1) {
            //Two Deck game
            applicationStateController.changeState(ApplicationState.Game);
        }
        else if (getButtonSelected() == 2) {
            //Inf Deck game
            applicationStateController.changeState(ApplicationState.Game);
        }
        else if (getButtonSelected() == 3) {
            applicationStateController.changeState(ApplicationState.MainMenu);
        }
    }

    @Override
    public int getButtonSelected() {
        return applicationStateController.getButtonSelected();
    }

    @Override
    public void setButtonSelected(int i) {
        applicationStateController.setButtonSelected(i);
    }

    @Override
    public int userInput() throws IOException {
        return applicationStateController.userInput();
    }
}