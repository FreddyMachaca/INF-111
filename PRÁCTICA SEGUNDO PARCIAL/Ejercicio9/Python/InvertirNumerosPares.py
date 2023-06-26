def invertir_numeros_pares(vector):
    for i in range(len(vector)):
        if vector[i] % 2 == 0:  # Verificar si el número es par
            vector[i] = int(str(vector[i])[::-1])  # Invertir el número par
    
    return vector

# Pedir al usuario ingresar el vector
entrada = input("Ingresa los números separados por espacios: ")
X = [int(num) for num in entrada.split()]

resultado = invertir_numeros_pares(X)
print(resultado)
