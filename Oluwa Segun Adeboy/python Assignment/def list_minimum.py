def list_minimum(numbers):
    
    minimum = number[0]
    
    for num in number[1:]:
        
        if number < minimum:
            
           minimum = number
            
    return minimum

data = [8, 4, 9, 2, 5, 7, 3]

print(list_minimum(data))  