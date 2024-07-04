saldo = 100000
while True:
    print("Bienvenido al Banco DUOC UC, seleccione una opción" )
    print("1. Consultar Saldo")
    print("2. Retirar Dinero")
    print("3. Salir")
    
    opcion = input("seleccione una opción (1-3):" )

    if opcion=="1":
        print(f"Tu saldo actual es: ${saldo}")
    elif opcion=="2":
        retiro = float(input("Ingrese la cantidad a retirar: $"))
        if retiro<= saldo:
            saldo -= retiro
            print(f"Has retirado ${retiro}. Nuevo saldo: ${saldo}")
        else:
            print("Saldo insuficiente")
    elif opcion=="3":
        print("Gracias por utilizar el cajero")
        break
    else:
        print("Opcion no valida. Por favor, selecciona una opción válida")