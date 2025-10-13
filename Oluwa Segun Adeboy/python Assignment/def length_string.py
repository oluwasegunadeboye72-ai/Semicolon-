def length_string(sample):
    
    if length(sample) < 3:
        
        return sample
    
        return sample + 'ly'
    
        return sample + 'ing'


print("Sample Output:")

print("Input: 'abc'     -> Output:", length_string('abc'))     

print("Input: 'string'  -> Output:", length_string('string'))  

print("Input: 'on'      -> Output:", length_string('on')) 