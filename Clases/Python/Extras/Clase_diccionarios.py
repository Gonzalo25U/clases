"""Diccionarios: son una estructura de datos manejados mediante Clave : Valor
Se definen mediante {}
Las claves son unicas e inmutables: numeros cadenas o tuplas.
Los valores: pueden ser caualquier tipo de dato y son mutables.
No tienen un orden especifico. """

#primera forma
diccionario = {
    "nombre" : "Gonzalo",
    "Edad"  : 25,
    "ciudad" : "Puerto Montt"
}
print(diccionario)
#segunda forma dict(clave = "string")
diccionario2 = dict(marca = "toyota", Modelo = "Yaris", Año = 2020)
#acceder a los elementos de un diccionario
print(diccionario2["Año"])
#segunda forma de acceder
print(diccionario.get("Edad"))
#agregar o modificar un valor de un diccionario.
diccionario2["Modelo"] = "Raize"
print(diccionario2)
#segunda forma para modificar un valor .update
diccionario2.update({"Año":2022})
print(diccionario2)
""" Eliminar elementos 
    Utilizando el metodo pop().
    Utilizando la palabra clave del
    Usando el metodo popitem()
    Utilizar el metodo clear()vacia el diccionario 
       """
diccionario3 = {
    "Nombre" : "Gonzalo",
    "Apellido" : "Ulloa",
    "Edad" : 25,
    "Comuna" : "Puerto Montt"
}
#Primer metodo  .pop()
diccionario3.pop("Comuna")
print(diccionario3)
#Segundo metodo -del- Nombre diccionario["clave a eliminar"]
del diccionario3["Edad"]
print(diccionario3)
#tercer metodo popitem() elimina el ultimo par clave valor diccionario.popitem
diccionario3.popitem()
print(diccionario3)
#ultimo metodo .clear()
diccionario3.clear()
print(diccionario3)
"""
len() : retorna el numero de pares clave valor
str() : retorna una representacion del diccionario en cadena
METODOS
keys(): retorna las claves
values() : retorna los valores
items() : retorna todos los items clave valor
copy() : realiza una copia de mi diccionario 
"""
print("_"*50)
diccionario4 ={
    "asignatura" : "fundamentos de programacion",
    "semestre" : "segundo",
    "carrera" : "ingenieria informatica",
    "años" : 4,
    "institucion" : "Duoc UC",
    "sede" : "Puerto Montt"
}
diccionario4.keys()
print(diccionario4)
#contar pares de elementos que tiene mi diccionario
#print(len(nombrediccionario))
print(len(diccionario4))
#imprimir en formato cadena str()
print(str(diccionario4))
#imprimir todas las claves del diccionario
print(diccionario4.keys())
#imprimir todos los valores
print(diccionario4.values())
print("_"*50)
#crear una copia de diccionario
diccionario_copia = diccionario4.copy()
print(diccionario_copia)

#iterar sobre mi diccionario por defecto imprime las claves
#for i in nombre_diccionario
    #print(i)

for x in diccionario_copia:
    print(x)

print("_"*50)
#iterar sobre un diccionario e imprimr los valores

for i in diccionario_copia.values():
    print(i)

print("_"*50)
#iterar sobre pares cada clave valor

for c,v in diccionario_copia.items():
    print(c+":"+str(v))