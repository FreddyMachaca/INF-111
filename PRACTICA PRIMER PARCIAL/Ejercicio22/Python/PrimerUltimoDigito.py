x = int(input("Ingrese un número X mayor que 100: "))

if x > 100:
    x_str = str(x)
    primer_digito = int(x_str[0])
    ultimo_digito = int(x_str[-1])
    print("Primer dígito:", primer_digito)
    print("Último dígito:", ultimo_digito)
else:
    print("El número X no es mayor que 100.")