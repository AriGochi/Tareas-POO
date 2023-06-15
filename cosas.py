class Alumno:
 facultad = "FES Aragón"

def __init__(self, nom, ed, carr):
    self.__nombre = nom
    self.__edad = ed
    self.__carrera = carr

def set_nombre(self, nom):
    self.__nombre = nom

def get_nombre(self):
    return self.__nombre

def set_edad(self, ed):
    self.__edad = ed

def get_edad(self):
    return self.__edad

def set_carrera(self, car):
    self.__carrera = car

def get_carrera(self):
    return self.__carrera

def __str__(self):
    cadena = "___Nombre: " +self.__nombre
    cadena = cadena + "Edad: " +str(self.__edad)
    cadena = cadena + "Carrera" + str(self.__carrera)
    cadena = cadena + "-------------"
    return  cadena

def estudiar (self,  horas = 1):
    print( f"El alumno {self.__nombre} esta estudiando {horas}")

class Perro:
    reino = "Canino"

    def __int__(self, raza, edad, estatura):
        self.__raza =raza
        self.__edad = edad
        self.__estatura = estatura

    #metodo de acceso get

    @property
    def raza (self)
        return  self.__raza

    @raza.setter
    def raza (self, la_raza):
        self.__raza = la_raza

    @property
    def edad(self):
        return self.__edad

    @edad.setter
    def edad(self, la_edad):
        if la_edad>0 and la_edad<20:
            self.__edad =la_edad

        else:
            print("Esa no es una edad vañlida")
            self.__edad = 0

    @property
    def estatura(self):
        return  self.__estatura

    @estatura.setter
    def estatura(self, la_estatura):
        if la_estatura > 0.1 and la_estatura < 1.1:
            self.__estatura = la_estatura

        else:
            print("No way")
            self.__estatura = 0.1

    def __str__(self):
        return f""

    @staticmethod
    def es_cachorro(edad):
        return edad <3

    @staticmethod
    def dormir(veces = 5):
        for n in range(veces):
            print(f"Dando vuelta{ n +1}")
            print("zzzz")

    @staticmethod
    def perro_grande(cls, est):
        if est >0.79:
            return cls("",0,est)
