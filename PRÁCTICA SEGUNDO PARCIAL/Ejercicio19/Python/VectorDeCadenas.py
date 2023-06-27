# Con input
vectorCadenas = input("Ingrese los elementos del vector de cadenas: ").split()
elementoX = input("Ingrese el elemento a buscar: ")

contador = 0
for cadena in vectorCadenas:
    if cadena == elementoX:
        contador += 1

print("El elemento", elementoX, "aparece", contador, "veces en el vector.")
