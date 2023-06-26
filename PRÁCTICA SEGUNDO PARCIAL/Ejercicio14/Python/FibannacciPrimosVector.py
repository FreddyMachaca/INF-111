def es_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False
    return True

def generar_vector(n):
    vector = []
    fibonacci_ant = 0
    fibonacci_act = 1
    contador = 1
    
    while contador <= n:
        if contador % 2 == 0:
            # Agregar número primo
            numero = 2
            while not es_primo(numero):
                numero += 1
            vector.append(numero)
        else:
            # Agregar número de Fibonacci
            vector.append(fibonacci_ant)
            fibonacci_ant, fibonacci_act = fibonacci_act, fibonacci_ant + fibonacci_act
        
        contador += 1
    
    return vector

n = int(input("Ingrese la cantidad de elementos del vector: "))
resultado = generar_vector(n)
for elemento in resultado:
    print(elemento)
