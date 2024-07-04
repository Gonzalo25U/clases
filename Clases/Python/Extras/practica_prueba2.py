valor_inicial = 5000
mas_peso = 500
mas_de_100km = 100


peso = 0
pagar = 0
distancia = 0

while True:
    nombre_cliente = input("Ingrese el nombre del cliente: ")
    if not nombre_cliente:
        print("El nombre del cliente no puede estar vacío.")
        continue
    elif len(nombre_cliente) > 30:
        print("El nombre del cliente no puede tener más de 30 caracteres.")
        continue
    break

while True:
    try:
        peso_paquete = float(input("Ingrese el peso del paquete en kilogramos: "))
        if peso_paquete <= 0:
            print("El peso del paquete debe ser un valor numérico positivo.")
            continue
    except ValueError:
        print("El peso del paquete debe ser un valor numérico.")
        continue
    break

while True:
    try:
        distancia_envio = float(input("Ingrese la distancia de envío en kilómetros: "))
        if distancia_envio <= 0:
            print("La distancia de envío debe ser un valor numérico positivo.")
        elif distancia_envio > 100:
            distancia = (distancia_envio-100)
            totalx100 = (mas_de_100km*distancia) 
            print(f"el valor por la distancia es {totalx100} ")
    except ValueError:
        print("La distancia de envío debe ser un valor numérico.")
        continue
    break

print("\nDatos del paquete ingresados correctamente:")
print(f"Nombre del cliente: {nombre_cliente}")
print(f"Peso del paquete: {peso_paquete} kg")
print(f"Distancia de envío: {distancia_envio} km")

precio_kg= peso_paquete * 500 + valor_inicial


print("-----PRECIOS-----")
print(f"el valor total es {precio_kg+totalx100}")