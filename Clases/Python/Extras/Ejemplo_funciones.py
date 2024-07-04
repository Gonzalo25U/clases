#ejmplo de funcion in argumento y sin retorno
def saludo():
    '''
    Esta funcion imprime en pantalla no toma agumentos ni retona ningun valor
    '''
    print("hola")
saludo()
#funcion in argumentos y con retorno
def obtener_suma ():
    '''
    esta funcion suma 2 elementos
    no recibe aumentos
    si retorna un valor
    '''
    numero1 = 5
    numero2 = 50
    return numero1+numero2
print("la suma es: ",obtener_suma)
#Ejemplo de funcion con elementos

def escribir_archivo(nombre_archivo, contenido):
    '''
    recibe 2 argumentos: nombre del archivo y su contenido
    escribe el contenido en el archivo
    '''
    with open(nombre_archivo, "w") as archivo:
        archivo.write(contenido)
    print(f"contenido escrito en ")

#solicitamos 
nombre_archivo = input("Ingresar el nombre del archivo ")
contenido = input("Ingresar el contenido del archivo ")
#llammos a la funcion
escribir_archivo(nombre_archivo, contenido)
#ejemplo de funcion con retorno y argumento
def leer_archivo(nombre_achivo):
    '''
    toma el nombre del archivo como argumento
    lo lee
    retorna el contenido del archivo
    '''
    try:
        with open(nombre_archivo, "r") as archivo:
            contenido = archivo.read()
            return contenido
    except FileNotFoundError:
        return "el archivo no fue encontrado"
    
#solicitamos el nombre
nombre_archivo = input("ingresa el nombre del archivo a leer")
#llamamo a la funcion leer y guardamos el contenido
contenido_archivo = leer_archivo(nombre_archivo)
#imprimir el contenido del archivo
print(f"contenido de {nombre_archivo}:\n {contenido_archivo} ")
#funcion con argumento y retorno

def contar_palabras(contenido):
    '''
    esta funcion recibe el contenido y cuenta las palabras en la cadena

    '''
    palabras = contenido.split()
    return len(palabras)

#llamamo a la funcion para contar palabras y guardar el resultado
numero_palabras = contar_palabras(contenido_archivo)
#imprimimos el resultado 
print(f"el archivo {nombre_archivo} tiene {numero_palabras} palabras.")

#funcion para contar lineas
def contar_lineas(contenido):
    '''
    recibe una cadena como argumento y cuenta las lineas totales
    '''
    lineas = contenido.split('\n')
    return len(lineas)
#llamamos a la funcion 
numero_lineas = contar_lineas(contenido_archivo)
#impime el numero de lineas
print(f"el achivo {nombre_archivo} tiene {numero_lineas} lineas")

#funcion para contar caracteres
def contar_caracteres(contenido):
    '''
    esta funcion cuenta cada caracter del archivo
    '''
    return len(contenido)
#llamamos a la funcion 
numero_caracteres = contar_caracteres(contenido_archivo)
#imprimir
print(f"el archivo {nombre_archivo} tiene {numero_caracteres} caracteres.")

#funcion que busca una palabra
def buscar_palabra (contenido, palabra):
    '''
    esta funcion toma como argumento el contenido
    retorna el numero de veces de la plbr en el contenido
    '''
    return contenido.lower().split().count(palabra.lower())
#solicitamos la palabra a buscar
palabra = input("ingresa la palabra a buscar")
apariciones = buscar_palabra(contenido_archivo, palabra)
#imprimo el numero de apariciones

print(f"la palabra {palabra} se repite {apariciones} veces. ")