a=5
while(a>0):
    print(f"el valor de (a) es :{a}")
    try:
        a = int(input("ingrese un valor"))
    except ValueError:
        print("error")