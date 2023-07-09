def generar_numero_digitos_primos(x):
    digitos = [int(d) for d in str(x)]
    primos = [d for d in digitos if es_primo(d)]
    y = int("".join(str(d) for d in primos))
    return y

def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

x = int(input("Ingrese un número: "))
y = generar_numero_digitos_primos(x)
print("El número con los dígitos primos es:", y)