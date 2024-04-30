## Tic-Tac-Toe Project

This document outlines the requirements and architecture for a basic Tic-Tac-Toe game.

### Requirements

#### Functionality

* **Visualization:** A visual representation of the game board (details not specified).
* **Players:**
    * Human players with names, symbols, and usernames.
    * Bots are not currently implemented (planned for future versions).
* **Gameplay:**
    * Players are randomized at the start of the game.
    * The game is designed for 3x3 boards (extendable in future versions).
    * Who makes the first move is not yet determined.

#### Design Considerations

* **Minimal Viable Product (MVP):** This initial version focuses on a simple, playable game.
* **Monolithic Architecture:** A single codebase manages all game logic for the MVP.

### Architecture

The project utilizes classes and enumerations for core functionalities:

**Classes:**

* **Player:** Represents a human player with attributes:
    * `name`: Player's name.
    * `symbol`: Symbol used by the player (`X` or `O`).
    * `username`: Unique username (optional).

* **Game:** Manages the overall game flow, including:
    * Board state representation.
    * Turn management.
    * Win condition checks.

**Enumerations (Enums):**

* **Mark:** Represents the symbols used by players (`X` or `O`).
* **CellState:** Represents the state of a cell on the board:
    * EMPTY
    * MARK_X
    * MARK_O

**Note:** `CellState` uses an enum instead of a boolean `isEmpty` flag for better readability and maintainability.

### Next Steps

* Implement bot functionality (limited to 1 bot per game initially).
* Determine who makes the first move.

This initial version prioritizes a working game. Future development can explore more modular architecture and additional features.
