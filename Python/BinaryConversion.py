def binaryConversion(conversion):
    l=[] 
    BinaryNum=""
    counter=0
    while counter!=8:
        r=conversion%2
        l.append(r)
        conversion=conversion//2
        counter=counter+1
    return l
