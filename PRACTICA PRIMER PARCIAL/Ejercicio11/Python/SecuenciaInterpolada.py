def generar_secuencia(n):
    secuencia = []
    count = 0
    value = 0
    
    for i in range(n):
        secuencia.append(value)
        count += 1
        
        if count == value + 1:
            value = 1 - value
            count = 0
    
    return secuencia

n = int(input("Ingrese la cantidad de términos: "))

secuencia = generar_secuencia(n)
print("La secuencia generada es:", secuencia)
