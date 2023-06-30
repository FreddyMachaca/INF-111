def es_multiplo(num1, num2):
    if num1 % num2 == 0 or num2 % num1 == 0:
        return True
    else:
        return False

numero1 = int(input("Ingrese el primer número: "))
numero2 = int(input("Ingrese el segundo número: "))

if es_multiplo(numero1, numero2):
    print("Uno de los números es múltiplo del otro.")
else:
    print("Los números no son múltiplos entre sí.")
