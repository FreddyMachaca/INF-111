def generar_secuencia(n):
    secuencia = [3, 1, 2]
    i = 3

    while len(secuencia) < n:
        if i % 2 == 1:
            secuencia.append(secuencia[i - 2] + secuencia[i - 3])
        else:
            secuencia.append(secuencia[i - 2] * 2)
        i += 1

    return secuencia[:n]

# Ejemplo de uso
n_terminos = 10
secuencia_generada = generar_secuencia(n_terminos)
print(secuencia_generada)