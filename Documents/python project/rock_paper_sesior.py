#Ask user to make a choice
#if a choice is not valid
#   print error
#let computer make a choice
#print choices(emojis)
#Determine the winner
#Ask the user if you want to continue?
#if not
#   terminate the game.
import random 
Rock='r'
Scissor='s'
Paper='p'
emojis ={Rock:'🪨',Scissor:'✂️',Paper:'📃'}
choices = tuple(emojis.keys())

def get_user_choice():
    while True:
        user_choice = input('Rock,paper or scissors? (r/p/s):').lower()
        if user_choice in choices:
            return user_choice
        else:
            print("invalid choice!")
def display_choices(user_choice,computer_choice):
    print(f"you_choose {emojis[user_choice]}")
    print(f"computer_choose {emojis[computer_choice]}")

def determine_winner(user_choice,computer_choice):
    if user_choice==computer_choice:
        print('Tie!')
    elif ((user_choice ==Rock and computer_choice==Scissor),
          (user_choice ==Scissor and computer_choice==Paper),  
          (user_choice ==Paper and computer_choice==Rock)):
        print('you win')
    else:
        print('you lose')
def play_game():
            
    while True:
        user_choice=get_user_choice()
        
        computer_choice = random.choice(choices)

        display_choices(user_choice,computer_choice)
        
        determine_winner(user_choice,computer_choice)
        should_continue = input('if you want to continue(y/n)?:').lower()
        if should_continue=='n':
            break 
play_game()