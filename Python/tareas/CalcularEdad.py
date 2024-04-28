from datetime import datetime
nombre = (input("ingresa tu nombre"))
def Calcular_edad(born):
    today = datetime.today()
    año = today.year - born.year - ((today.month, today.day) < (born.month, born.day))
    return año
cumpleaños = input("Ingrese su fecha de nacimiento (dd/mm/yyyy): ")
cumpleaños = datetime.strptime(cumpleaños, "%d/%m/%Y")
año = Calcular_edad(cumpleaños)
print( nombre, "tienes", año, "años.")