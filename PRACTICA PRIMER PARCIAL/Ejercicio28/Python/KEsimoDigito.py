def obtener_kesimo_digito(n, k):
    num_str = str(n)
    cantidad_digitos = len(num_str)
    k_ésimo_dígito = int(num_str[k - 1])
    return cantidad_digitos, k_ésimo_dígito

# Lectura de entrada
n, k = map(int, input("Ingrese el número N y el dígito K separados por un espacio: ").split())


cantidad_digitos, k_ésimo_dígito = obtener_kesimo_digito(n, k)

# Salida
print("Cantidad de dígitos:", cantidad_digitos)
print("El dígito", k, "es:", k_ésimo_dígito)