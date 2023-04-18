from ManejoArchivos import ManejoArchivos

#MANEJO DE CONTEXTO 'WITH': Sintaxis simplificada, abre y cierra el archivo
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
#    print(archivo.read())
#No hace falta usar 'try' ni 'finally'
#En el contexto de with lo que se ejecuta de manera automatica
#Utiliza diferentes metodos: __enter__este es el que abre el archivo
#__exit__: Cierra automaticamente el archivo

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())