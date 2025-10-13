def minimum_number(numbers):
    
    minimum = numbers[0]
    
    
    for num in numbers[1:]:
        
        if number > minimum:
            
           minimum = number
            
    return minimum


data = [8, 4, 9, 2, 5, 7, 3]

print(list_minimum(data))  