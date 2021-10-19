def solution(N):
    binN = format(N, "b")
    curCount = 0
    count = 0
    iFound = 0
    
    for i in binN:
        if (iFound == 1 and i == "1"):
            if (count > curCount):
                curCount = count
            count = 0
            iFound = 0
        
        if (i == "1"):
            iFound = 1
            continue
            
        if (iFound == 1 and i != "1"):
            count = count + 1
                
    return curCount
