texto = input("ingresa una o mas palabras:  ").lower()
vocales = "aeiou"
contador = 0
for i in texto:
    if i in vocales:
        contador = contador + 1
print(f"El texto tiene {contador} vocales")
