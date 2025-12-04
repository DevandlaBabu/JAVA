import random

while True:
    str=input("roll the dice(y/n):").lower()

    if str=="y":
        die1=random.randint(1,6)
        die2=random.randint(1,6)
        print(f"{die1},{die2}")
    elif str=="n":
        print("thanks for playing") 
        break
    else:
        print("invalid")
