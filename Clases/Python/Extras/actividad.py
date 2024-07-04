"""Un sistema que consulte la edad, y de acuerdo a ella indique si la persona es
mayor de edad o no"""
edad = int(input("escriba su edad:  "))

if edad >=18:
    print("tu eres mayor de edad")
elif edad < 18:
    print("eres menor de edad")
else:
    print("respuesta no valida")




"""Crear un programa de validación de usuario y contraseña (consultar usuario y
contraseña), los únicos dos usuarios conectados son:
User1: pedro Contraseña1: 1234
User2: angel Contraseña2: a4s1"""
User1 = "pedro"
Pass1 = "1234"
User2 = "angel"
Pass2 = "a4s1"

usuario = input("Escriba el nombre de usuario:  ")
contraseña = int(input("Escriba su contraseña:  "))

if usuario == User1 and contraseña == Pass1 or usuario == User2 and contraseña == Pass2:
    print("bienvenido...  ")
else:
    print("usuario o contraseña incorrectos...")



"""Solicitar el ingreso de 3 notas por pantalla, luego calcular el promedio de las 3
notas (cada nota tiene la misma ponderación), finalmente indicar con una
salida de pantalla “Aprobado” en el caso de que el promedio sea igual o
mayor a 4.0."""

nota1 = int(input("ingrese su nota N°1:  "))
nota2 = int(input("ingrese su nota N°2:  "))
nota3 = int(input("ingrese su nota N°3:  "))

promedio = (nota1 + nota2 + nota3)/3

if promedio >= 40:
    print("Esta aprobado")
elif promedio <= 40:
    print("Usted reprobo")
else:
    print("informacion no valida")

"""Crear una salida por pantalla con la siguiente información:
¿Cuál de los siguientes animales vive en el agua?
Perro
Cocodrilo
Conejo
Tiburón
Si la respuesta es Cocodrilo, asignar +0.5 a puntaje, si la
respuesta es Tiburón asignar +1.0 a puntaje, del cualquier
otro caso, no asignar valor, finalmente crear una salida por
pantalla para mostrar el puntaje obtenido."""  

Perro = "1"
cocodrilo = "2"
conejo = "3"
tiburon = "4"

mesaje = print("Cual de estos animales vive en el agua")
pregunta = int(input("perro (1);cocodrilo (2); conejo(3); tiburon(4)  "))

if pregunta == cocodrilo:
    print("+ 0.5 puntos")
elif pregunta == tiburon:
    print("+ 1.0 puntos") 
else:
    print("+ 0 puntos")
print(f"has obtenido {pregunta}")    


"""De la misma forma del ejercicio anterior, debes crear un formulario con 3
preguntas (4 respuestas por cada pregunta) de un tema a elección, ya sea
películas, series, caricaturas, entre otras.
Asignar puntaje a cada pregunta y dependiendo del puntaje generar una
escala de notas, así cuando los usuarios respondan las 3 preguntas se les
muestra mediante una salida por pantalla su puntaje obtenido y la nota que
equivale"""
hola = print("Hola lo invito a responder este cuestionario de 3 preguntas")
p1 = "cual de estos animales es mas pequeño:  "
alter1



print(hola)