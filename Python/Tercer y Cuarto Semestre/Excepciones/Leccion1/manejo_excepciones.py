from NumerosIgualesException import NumerosIgualesException
resultado = None

try:
    a = int(input('Digite el primer numero '))
    b = int(input('Digite el segundo numero '))
    if a == b:
        raise NumerosIgualesException('Los numeros son iguales')
    resultado = a / b #Modificamos
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {e}')
except Exception as e:
    print(f'Exception - Ocurrió un error: {e}')
else:
    print('No se arrojó ninguna excepcion')
finally: #Siempre se va ejecutar
    print('Ejecucion de este bloque finally')

print(f'El resultado es: {resultado}')
print('seguimos...')
