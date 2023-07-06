x = int(input("Ingrese un número X mayor que 100: "))

if x > 100:
    x_str = str(x)
    min_digit = min(x_str)
    y_str = x_str.replace(min_digit, '', 1)
    y = int(y_str)
    print("Y:", y)
else:
    print("El número X no es mayor que 100.")