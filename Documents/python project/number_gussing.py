import random
number_to_guess=random.randint(1,100)
while True:
    try:
        guess=int(input("guess the number between 1 to 100:"))
        if guess<number_to_guess:
            print("too low")
        elif guess>number_to_guess:
            print("too high")
        else:
            print("contrulations! you guess the number")
            break
    except ValueError:
        print('please enter a value number:')

    