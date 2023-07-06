x = 47527734  # Valor de X

if x > 100:
    x_str = str(x)
    digitos_repetidos = []
    for digito in set(x_str):
        if x_str.count(digito) > 1:
            digitos_repetidos.append(digito)
    print("Dígitos repetidos:", ", ".join(digitos_repetidos))
else:
    print("El número X no es mayor que 100.")
