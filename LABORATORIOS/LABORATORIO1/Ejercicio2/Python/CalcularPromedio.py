print("Ingrese la primera nota (0-100):")
nota1 = int(input())

print("Ingrese la segunda nota (0-100):")
nota2 = int(input())

print("Ingrese la tercera nota (0-100):")
nota3 = int(input())

promedio = (nota1 + nota2 + nota3) / 3.0

if 0 <= promedio <= 50:
    print("Reprobado")
elif 51 <= promedio <= 69:
    print("Aprobado y regular")
elif 70 <= promedio <= 79:
    print("Aprobado y bueno")
elif 80 <= promedio <= 89:
    print("Aprobado y muy bueno")
elif 90 <= promedio <= 100:
    print("Aprobado y excelente")
else:
    print("Promedio inválido")