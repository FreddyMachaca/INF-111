numero1 = int(input("Ingrese el primer número: "))
numero2 = int(input("Ingrese el segundo número: "))

print("Antes del intercambio:")
print("Primer número:", numero1)
print("Segundo número:", numero2)

auxiliar = numero1
numero1 = numero2
numero2 = auxiliar

print("Después del intercambio:")
print("Primer número:", numero1)
print("Segundo número:", numero2)