"""1)Calculadora de IMC: Crea un programa que solicite al usuario su peso en kilogramos y
su altura en metros. Calcula el índice de masa corporal (IMC) utilizando la fórmula IMC =
peso / (altura ** 2). Imprime el resultado del IMC con dos decimales."""

peso = int(input("ingrese su peso(Kg)"))
altura = float(input("ingrese su altura(m)"))
IMC = peso / (altura**2)

print("su indice de masa corporal es ",IMC)