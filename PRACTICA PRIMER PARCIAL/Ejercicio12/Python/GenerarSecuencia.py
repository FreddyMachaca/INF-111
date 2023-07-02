def generar_secuencia(n):
    secuencia = [1, 3]
    indice = 1

    for i in range(2, n):
        if i % 2 == 0:
            indice += 1
        else:
            indice += 2

        secuencia.append(indice)

    return secuencia

n_terminos = 20
secuencia = generar_secuencia(n_terminos)
print(secuencia)
