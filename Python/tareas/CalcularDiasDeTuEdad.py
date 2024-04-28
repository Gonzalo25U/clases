import datetime
nombre = input("ingrese su nombre")
año = int(input("ingrese su año de nacimiento(####)"))
mes = int(input("ingrese su mes de nacimiento(##)"))
dia = int(input("ingrese su dia de nacimiento(##)"))

fecha_de_nacimiento =datetime.datetime(año,mes,dia)
fecha_actual=datetime.datetime.now()
resultado=fecha_actual-fecha_de_nacimiento

print("Hola  ",nombre)
print("has vivido:", resultado.days) 