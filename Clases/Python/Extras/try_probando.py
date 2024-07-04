#se utiliza para encapsular un codigo y validar si tiene o no error
try:
    resultado = 10/0#generamos el error
    print(f"el resultado de la dicision es {resultado} ")
except ZeroDivisionError:
    print("ERROR: no se puede dividir por 0  ")