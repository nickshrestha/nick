
def Add(num1,num2):
    sum =[]

    b=0

    for i in range(7,-1,-1):
        a = num1[i]^num2[i]^b
        b = (num1[i]&num2[i])|((num1[i]^num2[i])&b)
        sum.append(a)
    if b!=0:
        sum="not 8-bit operation."

    
    return sum
