a = float(input("Enter first number:"))

b = float(input("Enter second number:"))

c = float(input("Enter third number:"))


if a <= b and b <= c:

    print ("Sorted order:", a, b, c)

elif a <= c and c <= b:
    print("Sorted order:", a, b, c, b)

elif b <= a and a <= c:
    print("Sorted order:", b, a, c)

elif b <= c and c <= a:
    print("Sorted order:", b, c, a)

elif c <= a and a <= b:
    print("Sorted order:", c, a, b)

else:

     print("Sorted order:", c, b, a) 