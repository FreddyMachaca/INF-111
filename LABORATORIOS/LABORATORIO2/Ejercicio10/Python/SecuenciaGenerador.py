def generar_secuencia(n):
    secuencia = []
    contador = 0
    repeticiones = 1

    for _ in range(n):
        secuencia.extend([contador] * repeticiones)
        contador = 1 - contador
        repeticiones += 1

    return secuencia[:n]

n_terminos = 10
secuencia_generada = generar_secuencia(n_terminos)
print(secuencia_generada)