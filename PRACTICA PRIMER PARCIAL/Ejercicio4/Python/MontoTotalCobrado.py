def calcular_monto_total(precios):
    monto_total = 0
    
    for precio in precios:
        if precio > 300:
            descuento = 0.2
        elif precio > 200:
            descuento = 0.15
        elif precio > 100:
            descuento = 0.07
        else:
            descuento = 0
        
        monto_descuento = precio * descuento
        monto_cobrado = precio - monto_descuento
        monto_total += monto_cobrado
    
    return monto_total

# Ejemplo de uso
precios = [350, 250, 120]
monto_total_cobrado = calcular_monto_total(precios)
print("El monto total cobrado es:", monto_total_cobrado, "Bs.")
