"""
Son un tipo de dato que permite almacenar datos de caualquier tipo. Ademas son mutables y dinamicas.
-Podemos guardar en ellas lo que sea.
-Mantienen el orden con el que fueron declaradas.
-Pueden ser indexadas.
-Se pueden anidar: es decir tener una lista dentro de otra lista.
-Mutables: se pueden modificar.
-Dinamicas: se pueden añadir o eliminar elementos.  
"""
lista = [1,2,3,4,5,6,7,8,9,10]
lista_variada = [1,"Python",3.67]

#las listas se leen desde el 0 en adelante
print(lista[9])
print(lista[-1])

#imprimir cada elemento de la lista
print(lista_variada[0])
print(lista_variada[1])
print(lista_variada[2])

#remplazar un elemento especifico de la lista definir la pocision de la lista = valor que quiero agragar
lista_variada[1]="javaScript"
print(lista_variada)

#eliminar un dato de la lista.
#1
lista_variada.remove(3.67)
print(lista_variada)
#2
del lista_variada[1]
print(lista_variada)

#anidar lista
lista_anidada = [1,2,3,["a","b","c",[4,5,6]]]
print(lista_anidada)

#acceder a un elemeto especifico de una lista anidada[],[],[]
print(lista_anidada[3][3][1])

#imprimir un rango de mi lista
#lista = [1,2,3,4,5,6,7,8,9,10]
print(lista[0:4])

#agregar un rango de numero a mi lista
lista[10:15]=[11,12,13,14,15]
print(lista)

#agregar a una lista de "n" a elementos a variables
lista2 = [1,2,3]
a,b,c = lista2
print(c)
print(b)
print(a)

#literar / repetir dentro de una lista
for iteracion in lista:
    print(iteracion)

#Enumerar cada elemento de la lista

for numero_indice, l in enumerate(lista):
    print(f"posicion de la lista {numero_indice} = valor de la lista: {l}") 

#unir 2 listas destintas en una
lista_1 = ["artista", "cancion","año"]
lista_2 = ["a","b","c"]
lista_3 = []

#unirlas con zip
for l1,l2 in zip(lista_1,lista_2):
    lista_3.append(l1+":"+l2 )
print(lista_3)

#agregar un elemento .append()
#eliminar el ultimo elemento .pop()
lista_4 = [5,7,2,4]
lista_4.pop()
print(lista_4)

#ordenar lista .sort()
lista_4.sort()
print(lista_4)

lista_4.sort(reverse=True)
print(lista_4)

lista_4.reverse()
print(lista_4)
