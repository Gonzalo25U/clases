#adivina el numero generado aleatoriamente
#importamos la libreria "random"
import random
numero_secreto = random.randint(1,100)
#print(numero_secreto)

intentos = 0

while True:
    intento = int(input("ingresar un numero del 1 al 100  "))
    intentos+=1

    #decision para saber si es mayor o menor
    if intento < numero_secreto:
        print(f"el numero ingresado es menor al numero secreto con {intentos} intentos ")
    elif intento > numero_secreto:
        print(f"el numero ingresado es mayor al numero secreto con {intentos} intentos ")
    else:
        print(f"Adivinaste, el numero secreto es {numero_secreto}")
        break
    print("fin del juego")