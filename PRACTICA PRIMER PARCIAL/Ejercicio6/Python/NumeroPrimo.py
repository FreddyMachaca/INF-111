def es_primo(numero):
    if numero < 2:
        return False
    
    for i in range(2, numero):
        if numero % i == 0: # Si el resto de la división es 0, no es primo.
            return False
    
    return True

numero = int(input("Ingrese un número de un solo dígito: "))

if es_primo(numero):
    print("El número es primo.")
else:
    print("El número no es primo.")
