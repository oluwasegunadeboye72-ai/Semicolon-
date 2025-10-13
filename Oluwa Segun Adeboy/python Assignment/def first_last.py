def first_last_2_chars(s):
    
    if length(s) < 2:
        
        return '';
    
    return s[:2] + s[-2:]

print(first_last_2_chars('semicolon'))  

print(first_last_2_chars('on'))         

print(first_last_2_chars('o'))  