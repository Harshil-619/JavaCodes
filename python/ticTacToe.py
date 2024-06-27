import tkinter as tk
from tkinter import messagebox

# Global variables
current_player = "X"
board = [" " for _ in range(9)]

# Function to check for a win
def check_win(player):
    # Check rows, columns, and diagonals
    for i in range(3):
        if board[i] == board[i + 3] == board[i + 6] == player:
            return True
        if board[3 * i] == board[3 * i + 1] == board[3 * i + 2] == player:
            return True
    if board[0] == board[4] == board[8] == player:
        return True
    if board[2] == board[4] == board[6] == player:
        return True
    return False

# Function to handle a button click
def on_button_click(button, idx):
    global current_player

    if board[idx] == " ":
        board[idx] = current_player
        button.config(text=current_player)
        
        if check_win(current_player):
            messagebox.showinfo("Tic Tac Toe", f"Player {current_player} wins!")
            reset_game()
        elif " " not in board:
            messagebox.showinfo("Tic Tac Toe", "It's a draw!")
            reset_game()
        else:
            current_player = "O" if current_player == "X" else "X"

# Function to reset the game
def reset_game():
    global current_player, board
    current_player = "X"
    board = [" " for _ in range(9)]
    for button in buttons:
        button.config(text=" ", state=tk.NORMAL)

# Create the main window
root = tk.Tk()
root.title("Tic Tac Toe")

# Create buttons
buttons = []
for i in range(9):
    row, col = divmod(i, 3)
    button = tk.Button(root, text=" ", font=("normal", 20), width=5, height=2,
                       command=lambda idx=i: on_button_click(buttons[idx], idx))
    button.grid(row=row, column=col)
    buttons.append(button)

# Create a reset button
reset_button = tk.Button(root, text="Reset", command=reset_game)
reset_button.grid(row=3, column=1)

# Start the game
root.mainloop()
