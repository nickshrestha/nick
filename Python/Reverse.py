def reverse(RevNum):
    Bin=[]
    BinStr=""
    for i in range(len(RevNum)-1,-1,-1):
        Bin.append(RevNum[i])
        BinStr=BinStr+str(RevNum[i])
    return Bin
