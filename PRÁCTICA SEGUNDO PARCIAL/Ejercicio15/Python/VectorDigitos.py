# Con input
numero = input("Ingrese un número: ")

digitos_impares = []
digitos_pares = []

for digito in numero:
    if int(digito) % 2 == 0:
        digitos_pares.append(int(digito))
    else:
        digitos_impares.append(int(digito))

print("Dígitos pares:", digitos_pares)
print("Dígitos impares:", digitos_impares)
