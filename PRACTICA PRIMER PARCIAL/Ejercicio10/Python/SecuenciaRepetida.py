def generar_secuencia(n):
    secuencia = []
    
    for i in range(1, n + 1):
        numero = i * 2
        secuencia.extend([numero, numero])
    
    return secuencia

n = int(input("Ingrese la cantidad de términos: "))

secuencia = generar_secuencia(n)
print("La secuencia generada es:", secuencia)