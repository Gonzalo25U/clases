"""Deberás construir un programa que está diseñado para ayudar en la venta
de pasajes. Inicia preguntándote cuántos pasajes deseas vender. Luego,
utiliza un proceso organizado (llamado bucle for) para pedirte el precio de
cada pasaje por separado. Si ingresas un valor que no es un número, te
indica que necesitas proporcionar un valor numérico válido. Al final, muestra
el monto total que se ha obtenido por la venta de todos los pasajes
 Solicita al usuario la cantidad de pasajes a vender.
 Se utiliza un bucle for para iterar sobre la cantidad de pasajes.
 Dentro del bucle, se solicita al usuario el precio de cada pasaje y se
acumula en la variable totalIngresos.
 Si el usuario ingresa un valor no numérico para el precio del pasaje,
el programa muestra un mensaje y sale del bucle usando break.
 Finalmente, se imprime el total de ingresos por la venta de pasajes"""

pasajes= int(input("¿cuantos pasajes deseas vender?:  "))
v = 1500
valor_total = v * pasajes
for i in range(1,pasajes+1) :
    print(f"el valor de {pasajes} pasaje es: {valor_total}")



