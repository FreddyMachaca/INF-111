# Con input
vector1 = list(map(int, input("Ingrese los elementos del primer vector: ").split()))
vector2 = list(map(int, input("Ingrese los elementos del segundo vector: ").split()))
vector3 = list(map(int, input("Ingrese los elementos del tercer vector: ").split()))

vector_resultado = []

for i in range(max(len(vector1), len(vector2), len(vector3))):
    if i < len(vector1):
        vector_resultado.append(vector1[i])
    if i < len(vector2):
        vector_resultado.append(vector2[i])
    if i < len(vector3):
        vector_resultado.append(vector3[i])

print("Vector resultado:", vector_resultado)
