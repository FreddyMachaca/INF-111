def fibonacci_range(a, b):
    fibonacci_numbers = []
    first = 0
    second = 1
    
    while first <= b:
        if first >= a:
            fibonacci_numbers.append(first)
        
        temp = first + second
        first = second
        second = temp
    
    return fibonacci_numbers

# Ejemplo de uso
a = int(input("Ingrese el valor de a: "))
b = int(input("Ingrese el valor de b: "))

fibonacci_numbers = fibonacci_range(a, b)
print("Los números de Fibonacci en el rango [", a, ",", b, "] son:", fibonacci_numbers)
