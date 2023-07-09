def generar_secuencia(n):
    secuencia = []
    contador = 0

    for i in range(n):
        secuencia.append(contador)
        if contador == 0:
            contador = 1
        else:
            contador = 0

    return secuencia

n_terminos = 12
secuencia_generada = generar_secuencia(n_terminos)
print(secuencia_generada)