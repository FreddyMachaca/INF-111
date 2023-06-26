# Pedir al usuario ingresar los vectores
entrada1 = input("Ingresa los elementos del primer vector separados por espacios: ")
vector1 = [int(num) for num in entrada1.split()]

entrada2 = input("Ingresa los elementos del segundo vector separados por espacios: ")
vector2 = [int(num) for num in entrada2.split()]

# Verificar que los vectores tengan la misma longitud
if len(vector1) != len(vector2):
    print("Los vectores deben tener la misma longitud.")
else:
    resultado = []
    for i in range(len(vector1)):
        suma = vector1[i] + vector2[i]
        resultado.append(suma)
    
    print("La suma de los elementos es:", resultado)
