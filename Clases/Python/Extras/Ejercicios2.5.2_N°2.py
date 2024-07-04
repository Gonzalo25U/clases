saldo = 500000
while True:
    print("iniciando.....")
    print("1.-Ver saldo")
    print("2.-retirar dinero")
    print("3.-Salir")
    opcion = int(input("Seleccione una opcion(1/3)"))
    if opcion==1:
        print(f"tu saldo actual es $ {saldo}")
        print("1.-volver atras")
        print("2.-salir")
        op = int(input("seleccione una opcion"))
        if op==1:
            continue
        elif op == 2:
            print("Saliendo....")
            break        
        else:
            print("opcion no valida")

    elif opcion==2:
       retiro = float(input("Ingrese la cantidad de dinero que retira"))
       if
       retiro -= saldo

