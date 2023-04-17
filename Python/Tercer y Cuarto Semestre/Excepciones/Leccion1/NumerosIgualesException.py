class NumerosIgualesException (Exception): #se extiende de la clase
    def __init__(self, mensaje):
        self.mensaje = mensaje