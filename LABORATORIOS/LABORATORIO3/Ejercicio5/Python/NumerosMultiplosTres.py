def generar_numero_multiplos_tres(x):
    digitos = [int(d) for d in str(x)]
    multiplos_tres = [d for d in digitos if d % 3 == 0]
    y = int("".join(str(d) for d in multiplos_tres))
    return y

x = int(input("Ingrese un número: "))
y = generar_numero_multiplos_tres(x)
print("El número con los dígitos múltiplos de 3 es:", y)