import math

def es_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(math.sqrt(numero)) + 1):
        if numero % i == 0:
            return False
    return True

def promediar_elementos_primos(vector):
    primos = []
    for num in vector:
        if es_primo(num):
            primos.append(num)
    if not primos:
        return None
    promedio = sum(primos) / len(primos)
    return promedio

# Pedir al usuario ingresar el vector
entrada = input("Ingresa los números separados por espacios: ")
X = [int(num) for num in entrada.split()]

resultado = promediar_elementos_primos(X)
if resultado is None:
    print("No hay números primos en el vector.")
else:
    print("El promedio de los números primos es:", resultado)
