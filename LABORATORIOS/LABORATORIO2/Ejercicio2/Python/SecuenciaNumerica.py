N = 12
secuencia = [2, 7]
i = 2

while len(secuencia) < N:
    if i % 2 == 0:
        secuencia.append(secuencia[i-1] * 2)
    else:
        secuencia.append(secuencia[i-1] + 7)
    i += 1

print(secuencia[:N])