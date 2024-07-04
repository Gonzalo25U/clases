'''
1.-
Creen un programa que emule la función de una calculadora, debe tener 4 funciones,
sumar, restar, dividir y multiplicar, el programa de permitir el ingreso de dos números de
tipo enteros. Este programa debe contener una pequeña validación que indique un
mensaje cuando se divide por 0, indicado que no se puede realizar la operación. Las
funciones a construir deben ser con argumentos y con retorno.
'''
def sumar(a,b):
    suma = a+b
    return suma
numero_1 = float(input("Ingrese el primer numero a sumar: "))
numero_2 = float(input("Ingrese el segundo numero a sumar: "))
print(f"la suma de {numero_1} y {numero_2} numeros es: {sumar(numero_1,numero_2)} ")

def restar(a,b):
    resta = a-b
    return resta
n1 = float(input("Ingrese el primer numero a restar:  "))
n2 = float(input("Ingrese el segundo numero a restar: "))
print(f"El resultado de restar {n1} y {n2} es: {restar(n1,n2)}")

def multiplicar(a,b):
    multiplicacion = a*b
    return multiplicacion
n_1 = float(input("Ingrese el primer numero de la multiplicacion: "))
n_2 = float(input("Ingrese el segundo numero a multiplicar: "))
print(f"El resultado de multiplicar {n_1} y {n_2} es : {multiplicar(n_1,n_2)}")

def dividir(a,b):
    division = a/b
    return division
num1 = float(input("Ingrese el primer numero de la division: "))
num2 = float(input("ingrese el segundo numero de la division: "))
print(f"El resultado de dividir {num1} y {num2} es : {dividir(num1,num2)}")