"""Problema 1: Análisis de ventas de la cafetería
La cafetería de grano ubicada en DUOC Puerto Montt necesita analizar sus ventas diarias.
La cafetería vende pan ciabatta, pie de limón, café, té, entre otros productos, y los alumnos
compran a diario. Se te ha proporcionado un archivo llamado "ventas.txt" que contiene las
ventas de cada producto por día, separadas por comas. Tu tarea es leer el archivo, calcular
el total de ventas para cada producto y el promedio de ventas diarias, y luego imprimir los
resultados.

               
pan ciabatta =  50,30,20,10
pie de limón =  40,25,15,8
café =          60,35,25,12
té =            45,28,18,9
otros =         55,32,22,11

"""


pan_ciabatta_total = 50+30+20+10
pie_de_limón_total = 40+25+15+8
café_total = 60+35+25+12
té_total = 45+28+18+9
otros_total = 55+32+22+11

pan_ciabatta_promedio = pan_ciabatta_total/4
pie_de_limón_promedio = pie_de_limón_total/4
café_promedio = café_total/4
té_promedio = té_total/4
otros_promedio = otros_total/4



print(f"LOS TOTALES DE VENTA SON:\n PAN CIABATTA: {pan_ciabatta_total}\n PIE DE LIMÓN: {pie_de_limón_total}\n CAFÉ: {café_total}\n TÉ: {té_total}\n OTROS: {otros_total}")
print(f"LOS PROMEDIOS DE VENTAS:\n PAN CIABATTA: {pan_ciabatta_promedio}\n PIE DE LIMÓN: {pie_de_limón_promedio}\n CAFÉ: {café_promedio}\n TÉ: {té_promedio}\n OTROS: {otros_promedio}")

with open("informe_ventas.txt", "w") as informe:
    informe.write(f"Informe de ventas-Cafetería de Grano\n\n LOS TOTALES DE VENTA SON:\n PAN CIABATTA: {pan_ciabatta_total}\n PIE DE LIMÓN: {pie_de_limón_total}\n CAFÉ: {café_total}\n TÉ: {té_total}\n OTROS: {otros_total}\n LOS PROMEDIOS DE VENTAS:\n PAN CIABATTA: {pan_ciabatta_promedio}\n PIE DE LIMÓN: {pie_de_limón_promedio}\n CAFÉ: {café_promedio}\n TÉ: {té_promedio}\n OTROS: {otros_promedio}")

