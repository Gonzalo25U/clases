#en rango
print("en range")
rango = range(5)
for i in rango:
    print(f"El valor de i es: {i}")
#en texto
print("en texto")
texto = "hola"
for i in texto:
    print(f"El valor de i es: {i}")
#en listas
print("en lista")
lista0 = []
lista0.append("juan")
lista0.append("genesis")
lista0.append("paola")
lista0.append("sofia")
for i in lista0:
    print(f"el valor de i es: {i}")
#en matriz
print("en matriz")
matriz_numerica=[[1,2,3],
                 [4,5,6],
                 [7,8,9]]
for i in matriz_numerica:
    print(f"el valor de la lista es: {i}")
    for q in i:
        print(f"el valor de i es: {q}")

"""crear un algoritmo que almacene en una lista los numeros de una
tabla de multiplicar, de acuerdo al numero ingresado por teclado
3- [3,6,9,12,15,18,21,24,27,38]"""

lista_mutiplicar = []
num=int(input"ingresar un numero")
for i in range(1,11):

    lista_mutiplicar.append(i*num)
print(lista_mutiplicar)


"""crear un algoritmo que permita ingresar 3 nombres y almcenarlo en una lista
luego debe imprimirlo en pantalla, el nombre que tenga mayor cantidad de caracteres"""