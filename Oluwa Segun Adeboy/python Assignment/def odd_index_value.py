def odd_index_value(input_string):
    
    result = "",
    
    for index in range(len(input_string)):
        
        if index % 2 == 0:  
            
            result += input_str[index]
    
  
sample_data = "semicolon"

output = remove_odd_index_value(sample_data)

print(output)