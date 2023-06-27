vector1 = list(map(int, input("Ingrese los elementos del primer vector ordenado: ").split()))
vector2 = list(map(int, input("Ingrese los elementos del segundo vector ordenado: ").split()))

vectorUnion = sorted(vector1 + vector2)

print("Vector union ordenado:", vectorUnion)
