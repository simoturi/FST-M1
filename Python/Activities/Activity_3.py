player1 = input("Enter the Players1 name ")
player2 = input("Enter the Player2 name ")
player1_Option = input(player1 + " do you want to choose Rock, Scissors or Paper ? ").lower()
player2_Option= input(player2 + " do you want to choose Rock, Scissors or Paper ? ").lower()
if player1_Option == player2_Option:
    print("Game Tie!!")
elif player1_Option == 'rock':
    if player2_Option == 'scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif player1_Option == 'scissors':
    if player2_Option == 'paper':
        print("Scissors win")
    else:
        print("Rock wins!")
elif player1_Option == 'paper':
    if player2_Option == 'rock':
        print("Paper wins")
    else:
        print("Scissors win")
	
else:
    print("Invalid input! You have not entered Paper, Rock or Scissors, Please try again.")
