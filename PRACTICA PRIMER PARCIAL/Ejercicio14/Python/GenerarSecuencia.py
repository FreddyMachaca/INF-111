def generar_secuencia(n):
    secuencia = []
    indice = 1
    incremento = 1

    for i in range(n):
        if i % 3 == 2:
            secuencia.append(-5)
        else:
            secuencia.append(indice)
            indice += incremento
            incremento += 1

    return secuencia

n_terminos = 20
secuencia = generar_secuencia(n_terminos)
print(secuencia)
