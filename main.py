from cosas import Alumno


def main():
    al1 = Alumno("Jose",19,"ICO")
    print(vars(al1))
    al1.__nombre = "Diego"
    print(vars(al1))
    al1.set_nombre("Ari")
    print(vars(al1))
    print("-------To String----")
    print(al1)
    al1.set_edad(999)
    print(al1)
    al1.estudiar(4)
    print("_____Perro---")
    perro1 = Perro("Podle", 2, 0.35)
    print(vars(perro1))
    perro1.raza = "De la calle"
    print(vars(perro1))
    perro1.__raza = "otra"
    perro1.edad = 12
    perro1.estatura = 0.43
    print(perro1)
    cachorro = Perro.es_cachorro(perro1.edad)
    print(cachorro)
    Perro.dormir()
    danes = Perro.perro_grande(0.8)
    print(danes)


main()
