def unir_numeros(x, y):
    str_x = str(x)
    str_y = str(y)
    z = int(str_x + str_y)
    return z

x = int(input("Ingrese el primer número: "))
y = int(input("Ingrese el segundo número: "))
z = unir_numeros(x, y)
print("El tercer número obtenido es:", z)