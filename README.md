# LDTS_<1207>
LDTS Project - Blackjack game

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


- **Project name:** LDTS_L12GR07 - Blackjack
- **Short description:** Blackjack game
- **Environment:** Windows/Unix console
- **Tools:** Java
- **Institution:** [FEUP](https://sigarra.up.pt/feup/en/web_page.Inicial)
- **Course:** [LDTS](https://sigarra.up.pt/feup/en/UCURR_GERAL.FICHA_UC_VIEW?pv_ocorrencia_id=520319) (Software Design and Testing Laboratory)
- **Project grade:** 17.1
- **Group members:**
 - Ana Filipa Geraldes (up202208030@up.pt), 
 - Filipa Fidalgo (up202208039@up.pt),
 - Leonor Couto (up202205796@up.pt).

--- 

### GAME DESCRIPTION

In this exciting gambling game of **'Blackjack'**, we provide an engaging and strategic experience for players within the constraints of purely textual interface.

Players are dealt virtual cards, and the objective is to build a hand with a total value as close to 21 as possible without exceeding it. The game incorporates the classic rules of this iconic game, where numbered cards retain their face value, face cards are worth 10 points, and an Ace can be either 1 or 11 points. Players make decisions to hit, stand or
double down based on their current hand and the dealer's visible card. The challenge lies in making strategic choices to beat the dealer while managing the risk of going over 21.

We also included in the game a last ten games menu, that allows us to see who here the last ten people to play and their gains and losses.

This project was developed by *Filipa Geraldes* (*up202208030*@fe.up.pt), *Filipa Fidalgo* (*up202208039*@fe.up.pt) and *Leonor Couto* (*up202205796*@fe.up.pt) for LDTS 2023/24.

For a more detailed version of this description click [here](./docs/README.md).

### FEATURES

- **Change selected button** - using arrow keys you can change the selected button (it's the red one).
- **Select button** - to select a button for the program to execute an action (e.g. start game, exit, etc.) you need to press enter key.
- **Insert username and bet** - in start menu the user can write the username using alpha keys and when ready presses enter key, in the game the user write the bet using numerical keys and then presses the enter key so the game can start.
- **Chose how many decks** - in a menu the user is presented with 3 options, to play with one deck, two decks, or the infinite mode.
- **Chose the move** - the user can choose between hit, stand or double down.
- **Card Information** - stores the suit, rank, and graphical representation of the playing card.
- **Value Calculation** - calculates and returns the numerical value of the card based on its rank.
- **Dealing Cards** - the game will deal two cards to the player at the start of the round.
- **Hit** - gives the player another card from the deck.
- **Stand** - the player has finished the move and gives the dealer's turn to play.
- **Double down** - gives the player another card from the deck and double the bet.
- **Game Over** - the player has no credit left, the player can quit the game or reset the credit to 1000.
- **Player won** - when player chooses stand and the dealer's hand has a value bigger than 21.
- **Player lost** - when player chooses hit or double down and the player's hand becomes bigger than 21 or the player chooses stand and dealer's hand is bigger than the player's hand and smaller or equal to 21.
- **Draw** - when player chooses stand and dealer's hand has the same value.
- **Placing Bets** - the player can place a bet by entering a specific amount before the round begins. Supports backspace for correction and limits the bet to 6 digits.
- **Adjusting Credits** - depending on the outcome, the player's credits are adjusted. Winning a round may increase their credits, while losing decreases them.
- **Next Round** - the game allows the player to start a new round, placing a new bet and continuing the gameplay.
- **Save game information** - for each play the game saves the username and the value won or lost in a csv file.
- **Background Music** - the background music, initialized with a file path to "background_music.wav," creates a pleasant ambiance during gameplay.
- **Music Selection** - different music tracks are available for specific in-game events. For example:
- **Option Selection** - a distinct sound is played when a player selects an option. This adds responsiveness to user actions and enhances the interactive feel of the game.
- **Option Click Music** - when a player successfully clicks on an option, the "select_successfully.wav" track plays, providing auditory feedback for the action.
- **Win Music** - when a player achieves victory, the "win.wav" music track is played, celebrating their success.
- **Game Over Music** - the "game_over.wav" track is triggered when the game concludes, providing an audio cue for the end of the gaming session.
- **Card-related Sounds** - the "card_shuffle.wav" track is played during the shuffling of cards, adding realism to the card game environment. The "dealing_card.wav" track is used to signify the dealing of cards, contributing to the immersive gameplay experience.
- **Adjusting Credits** - depending on the outcome, the player's credits are adjusted. Winning a round may increase their credits, while losing decreases them.
- **Next Round** - the game allows the player to start a new round, placing a new bet and continuing the gameplay.
- **Display last 10 games** - the user can access the last 10 games in the program.

### GAME PREVIEW

### MOCKUPS
**Main Menu**

<img src='docs/photos/mainMenu.png' width='500'>

**Start Menu**

<img src='docs/photos/startMenu.png' width='500'>

**Last 10 Games**

<img src='docs/photos/last10Games.png' width='500'>

**Decks Menu**

<img src='docs/photos/decksMenu.png' width='500'>

**Choosing Bet**

<img src='docs/photos/initialGame.png' width='500'>

**Playing**

<img src='docs/photos/playingGame.png' width='500'>

**Player Lost**

<img src='docs/photos/playerLost.png' width='500'>

**Player Won**

<img src='docs/photos/playerWon.png' width='500'>

**No Credit Left**

<img src='docs/photos/noCreditLeft.png' width='500'>

**How To Play**

<img src='docs/photos/howToPlay1.png' width='500'>
<img src='docs/photos/howToPlay2.png' width='500'>
<img src='docs/photos/howToPlay3.png' width='500'>
<img src='docs/photos/howToPlay4.png' width='500'>

**Exit Menu**

<img src='docs/photos/exitMenu.png' width='500'>
