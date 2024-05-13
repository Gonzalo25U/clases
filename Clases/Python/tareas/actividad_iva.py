"""7)Calculadora de descuento: Escribe un programa que solicite al usuario el precio original
de un producto y el porcentaje de descuento con un 40%. Calcula el precio final después de
aplicar el descuento e imprime el sub total, total y agrega el porcentaje respectivo para el
IVA"""


producto =input("escriba el nombre del producto a la venta:  ")
precio = int(input(f"ingrese el valor de {producto}:$  "))
descuento = (precio * 40)/100
precio_descontado = precio - descuento
iva = (precio_descontado * 19)/100
resultado = precio_descontado + iva

print(f"el valor de {producto} es: $ {resultado}")


