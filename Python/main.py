import greeting
import Conclude
import Valid
import BinaryConversion
import Reverse
import Calc

                                 
greeting.Greeting()

Loop=True
while Loop==True:
    
    firstString=False
    while firstString==False:
        try:
            number1=int(input("Enter The First Decimal Number: "))
            number1=Valid.valid(number1)
            print("\n")
            firstString=True
        except:
            print("***The Given Input is Invalid***")
            
    secondString=False
    while secondString==False:
        try:
            number2=int(input("Enter The Second Decimal Number: "))
            nuberm2=Valid.valid(number2)
            print("\n")
            secondString=True
        except:
            print("***The Given Input is Invalid***")
            
    firstRev=BinaryConversion.binaryConversion(number1)
    secondRev=BinaryConversion.binaryConversion(number2)

    First=Reverse.reverse(firstRev)
    Second=Reverse.reverse(secondRev)

 
    result=Calc.Add(First,Second)

    string=""
    for i in range(len(result)-1,-1,-1):
        string= string+ str(result[i])
        
    
    print("Binary Conversion for First Number :",First)
    print("Binary Conversion for Second Number :",Second)
    print("\n")
    print("Sum of binary numbers is: ",string)
    
   
    tocontinue=input("Do you want to continue?(Yes/No): ")
    if tocontinue=="NO" or tocontinue=="no":
        break

Conclude.conclude()
