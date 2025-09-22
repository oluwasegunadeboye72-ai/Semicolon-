start = int(input("Enter start number:"))

end = int(input("Enter end number:"))

print(f"\n{'number':<6}\t{'square'<6}\t{'cube':<6}")


for number in range(start, end + 1):

    square = number ** 2
    cube = number ** 3

    print(f"{number:<6}\t{square:<6}\t{cube:<6}")