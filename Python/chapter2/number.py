number = int(input("Enter a five-digit integer:"))


digit1 = number // 10000
digit2 = (number % 10000) // 1000
digit3 = (number % 1000) // 100
digit4 = (number % 100) // 10
digit5 = number % 10

print(f"{digit1} {digit2} {digit3} {digit4} {digit5}")