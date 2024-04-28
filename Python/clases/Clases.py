saludo = "Hola"
nombreAlumno = "Pedro"
mensaje = saludo + " " + nombreAlumno + " Hola como estás"
print(mensaje)
edad = 18
es_estudiante = True
tiene_trbajo = False
#operaciones lógicas de cadenas 
es_mayor_de_edad = edad >= 18 #comprobando so la edad es mayor o igual a 18
puede_votar = es_mayor_de_edad and tiene_trbajo
print("es mayor de edad?", es_mayor_de_edad)
print("puede votar?", puede_votar)
#listas: son colecciones de datos ordenados y modificables.

#pueden contener distintos tipos de datos.Para declarar una utilizamos [].
numeros = [1,2,3,4,5,6,7,8,9]#lista de numeros.
alumnos = ["Juan", "Fulano", "Cosme Fulanito"]#lista 
listaMixta = [1,"hola",False,1.2]
print(listaMixta)#lista completa.
print(listaMixta[2])#Lista detallada.
print(listaMixta[-2])#Orden inverso la lista parte desde el número 1

#tuplas: son colecciones de datos ordenados e inmutables. una vez han sido creadas no se pueden modificar los datos
cordenadas = (10,20)
meses = ("enero", "febreo", "marzo")
print(meses[2])
print(meses[-1])

#conjuntos:son colecciones de datos desordenados y no indexados.
#se pueden definir de dos maneras 1 - {} 2- set()
numerosPrimos = {2,3,5,7,11}
lenguaje=set("python3")
numerosPrimos.add(13)
lenguaje.remove("3")
print(numerosPrimos)
print(lenguaje)
persona = {
    "nombre": "Gonzalo",
    "Nacionalidad": "Chileno1",
    "Ciudad": "Puerto Montt",
}
print(persona["nombre"])#imprimir un diccionario con un dato especifico
#modificar un dato especifico
persona["Nacionalidad"] = "Chileno"
print(persona)
#agrega nuevos datos al diccionario clave: valor
persona["Edad"] = 50
print(persona)
curso = 10
curso = 25
print(curso)
#cambiar el tipo de dato
Num1 = int(input("ingrese un numero"))
Num2 = int(input("ingrese un numero"))
suma = Num1+Num2
print(suma)
print(type(Num1))

           
        