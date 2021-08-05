def valid(character):
    while character<0 or character >255:
        print("\n")
        print("Please, Enter the valid decimal number." )
        
        character=int(input("Please re-enter the decimal  number between 0 to 255:"))
    return character
        
