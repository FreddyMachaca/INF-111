def generar_secuencia(n):
    secuencia = []
    contador = 0

    for i in range(n):
        if contador == 3:
            secuencia.append(0)
            contador = 0
        else:
            secuencia.append(1)
            contador += 1

    return secuencia

n_terminos = 20
secuencia = generar_secuencia(n_terminos)
print(secuencia)
