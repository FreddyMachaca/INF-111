def generar_secuencia_collatz(n):
    secuencia = [n]

    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            n = n + 1
        secuencia.append(n)

    return secuencia

numero = 11
secuencia_generada = generar_secuencia_collatz(numero)
print(secuencia_generada)