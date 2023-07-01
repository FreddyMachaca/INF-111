def generar_secuencia(n):
    secuencia = [0, 1]
    
    for i in range(2, n):
        nuevo_termino = secuencia[i - 1] + secuencia[i - 2] - 1
        secuencia.append(nuevo_termino)
    
    return secuencia

n = int(input("Ingrese la cantidad de términos: "))

secuencia = generar_secuencia(n)
print("La secuencia generada es:", secuencia)
