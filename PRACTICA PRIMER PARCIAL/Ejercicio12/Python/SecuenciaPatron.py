def generar_secuencia(n):
    secuencia = []
    count = 1
    
    for i in range(n):
        if count % 2 == 0:
            secuencia.append(count + 1)
        else:
            secuencia.append(count)
        
        count += 2
    
    return secuencia

n = int(input("Ingrese la cantidad de términos: "))

secuencia = generar_secuencia(n)
print("La secuencia generada es:", secuencia)
