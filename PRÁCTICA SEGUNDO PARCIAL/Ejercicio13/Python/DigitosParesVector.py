numero = input("Ingrese un número: ")
digitos_pares = []

for digito in numero:
    if int(digito) % 2 == 0:
        digitos_pares.append(int(digito))

print("Dígitos pares:", digitos_pares)
