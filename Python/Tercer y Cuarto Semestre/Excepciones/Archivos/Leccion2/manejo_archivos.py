#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding='utf8') #la w es de 'Write'
    archivo.write('Programamos con diferentes tipos de archivol, ahora con txt. \n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son:\nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt es pra text test \nb archivos binarios \nw+ lee y escribe \nr+ escribe y lee')
    archivo.write('\nSaludos a todos los alumnos de la tecnicatura')
    archivo.write('\nCon esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() #Con esto se cierra el archivo
#archivo.write('Todo quedo perfecto'): este es un error
