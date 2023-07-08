def mostrar_menor_de_cuatro_numeros():
    print("Ingrese el primer número:")
    numero1 = int(input())
    
    print("Ingrese el segundo número:")
    numero2 = int(input())
    
    print("Ingrese el tercer número:")
    numero3 = int(input())
    
    print("Ingrese el cuarto número:")
    numero4 = int(input())
    
    menor = min(numero1, numero2, numero3, numero4)
    
    print("El menor número es:", menor)
    print()

def indicar_signo_de_numero():
    print("Ingrese un número:")
    numero = int(input())
    
    if numero > 0:
        print("El número es positivo")
    elif numero < 0:
        print("El número es negativo")
    else:
        print("El número es nulo")
    print()

def calcular_producto_y_potencia():
    print("Ingrese el primer número:")
    numero1 = int(input())
    
    print("Ingrese el segundo número:")
    numero2 = int(input())
    
    producto = numero1 * numero2
    potencia = numero1 ** numero2
    
    print("El producto de los números es:", producto)
    print("La potencia del primer número elevado al segundo número es:", potencia)
    print()

def calcular_promedio_de_cinco_numeros():
    print("Ingrese el primer número:")
    numero1 = int(input())
    
    print("Ingrese el segundo número:")
    numero2 = int(input())
    
    print("Ingrese el tercer número:")
    numero3 = int(input())
    
    print("Ingrese el cuarto número:")
    numero4 = int(input())
    
    print("Ingrese el quinto número:")
    numero5 = int(input())
    
    promedio = (numero1 + numero2 + numero3 + numero4 + numero5) / 5.0
    
    print("El promedio de los números es:", promedio)
    print()

opcion = 0

while opcion != 5:
    print("MENU DE OPCIONES")
    print("1. Mostrar el menor de 4 números")
    print("2. Indicar si un número es positivo, negativo o nulo")
    print("3. Hallar el producto y la potencia de 2 números enteros")
    print("4. Hallar el promedio de 5 números")
    print("5. Salir")
    print("Ingrese una opción:")
    
    opcion = int(input())
    
    if opcion == 1:
        mostrar_menor_de_cuatro_numeros()
    elif opcion == 2:
        indicar_signo_de_numero()
    elif opcion == 3:
        calcular_producto_y_potencia()
    elif opcion == 4:
        calcular_promedio_de_cinco_numeros()
    elif opcion == 5:
        print("Saliendo del programa...")
    else:
        print("Opción inválida")
    print()