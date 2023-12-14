package com.projLDTS.blackjack.viewer.game;

import com.projLDTS.blackjack.gui.LanternaGUI;
import com.projLDTS.blackjack.gui.UserInput;
import com.projLDTS.blackjack.model.game.Cards.Hand;
import com.projLDTS.blackjack.viewer.StateViewer;

import java.io.IOException;


public class GameViewer implements StateViewer {
    private final LanternaGUI gui;

    int buttonSelected;
    boolean split;
    boolean afterPlay = false;

    public GameViewer(LanternaGUI gui_) {
        gui = gui_;
    }

    public void draw() throws IOException {
        gui.clear();
        gui.drawExit();
        gui.drawCredit();
        gui.drawLine();
        gui.drawBet();
        drawElements();
        gui.refresh();
    }

    public int getButtonSelected() {
        return buttonSelected;
    }
    public void setButtonSelected(int i) {
        buttonSelected = i;
    }

    @Override
    public int userInput() throws IOException {
        if (afterPlay) return new UserInput(gui).pLostInput();
        return new UserInput(gui).GameInput(buttonSelected);
    }

    @Override
    public void close() throws IOException {
        gui.close();
    }

    public void drawElements() throws IOException {
        gui.drawHitButton(buttonSelected == 0);
        gui.drawStandButton(buttonSelected == 1);
        gui.drawDoubleDownButton(buttonSelected == 2);
        gui.drawSplitButton(buttonSelected == 3, split);
        gui.refresh();
    }

    public void setSplit(boolean i) {
        split = i;
    }

    public void playerLost() throws IOException {
        gui.drawPlayerLost();
        gui.refresh();
    }

    public void setAfterPlay(boolean i) {
        afterPlay = i;
    }

    public void playerWon() throws IOException {
        gui.drawPlayerWon();
        gui.refresh();
    }

    public void drawCards(Hand hand) {
        gui.drawCards(hand);
    }
    private void drawDealerHand(LanternaGUI gui_) {
        /*
        List<Card> cards = new ArrayList<Card>(game.getGame().getDealer().getHand().getHand());
        if (cards.size() < 2) {
            cards.
        }
         */
    }
}
