def generar_secuencia(n):
    secuencia = []
    num = 2

    while len(secuencia) < n:
        if es_primo(num):
            secuencia.append(num)
        num += 1

    return secuencia


def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True


n_terminos = 10
secuencia = generar_secuencia(n_terminos)
print(secuencia)
