'''casino duoc

1 funcion agregar producto
2 funcion buscar producto
3 funcion eliminar producto
4 funcion mostrar productos
5 salir

'''
from funciones_python import *
import funciones_python as funciones

while True:
    print("\nInventario casino DUOC\n")
    print("1 funcion agregar producto: ")
    print("2 funcion buscar producto: ")
    print("3 funcion eliminar producto: ")
    print("4 funcion mostrar productos: ")
    print("salir")
    opcion = int(input("ingresar opcion "))

    if (opcion == 1):
        funciones.agregar_productos()
    elif (opcion == 2):
        print()
    elif (opcion == 3):
        print()
    elif (opcion == 4):
        funciones.mostra_producto()
    elif (opcion == 5):
        break
    else:
        print("opcion invalida")    