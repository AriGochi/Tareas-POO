from cosas import *

def main():
    l1 = Libro.libro_planeta("EL PERFUME", Autor("Patrik", "PS"), 1980)
    print(l1)
    l1.autor.pseudonimo = l1.autor.pseudonimo.lower()
    print(l1)
    print("------Herencia-----")
    al2 = Alumno("JOse", 19,"324443", "iCO", 9)
    al2.nombre = "Pepe"
    print(vars(al2))

main()