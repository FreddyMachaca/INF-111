def calcular_inverso(x):
    inverso = int(str(x)[::-1])
    return inverso

x = int(input("Ingrese un número: "))
inverso = calcular_inverso(x)
print("El inverso del número es:", inverso)