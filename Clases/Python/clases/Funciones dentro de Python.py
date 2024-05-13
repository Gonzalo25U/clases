#funciones dentro de Python
#funciones sin parametros de retorno
#para definir una funcion en python se utiliza def

def saludar():
    print("hola")
saludar()


#funcion con parametros de retorno
def saludarConNombre():
    nombre = "gonzalo"
    print(nombre)
saludarConNombre()  


#solicitar datos al usuario para hacer una suma


#definir la funcion de suma
def suma(numeroUno,numeroDos):
    resultado = numeroUno+numeroDos
    numeroUno = int(input("escribe el numero 1 "))
    print(numeroUno)
    numeroDos = int(input("escribe el numero 2 "))
    print(numeroUno)
    
    print(resultado)

suma()