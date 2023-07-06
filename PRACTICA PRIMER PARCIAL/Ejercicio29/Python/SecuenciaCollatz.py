def secuencia_collatz(n):
    pasos = 0
    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            n = n + 1
        pasos += 1
    return pasos

# Lectura de entrada
t = int(input("Ingrese el número de casos de prueba: "))
casos = []
for _ in range(t):
    n = int(input("Ingrese el número de inicio de la secuencia: "))
    casos.append(n)

# Salida
for n in casos:
    pasos = secuencia_collatz(n)
    print(pasos)