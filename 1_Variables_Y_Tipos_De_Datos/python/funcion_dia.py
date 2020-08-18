


def que_dia_es(dia):
    dias_de_la_semana = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo']
    return dias_de_la_semana[dia]

def que_mes_es(mes ):

    meses = ['enero','febrero','marzo','abril','mayo','junio','julio','agosto','septiembre','octubre','noviembre','diciembre']

    return meses[mes]

def que_fecha_es(dia,mes):
    a = que_dia_es(dia)
    b = que_mes_es(mes)
    return a,b
    #return que_dia_es(dia),que_mes_es(mes)


print(que_dia_es(1))
print( que_mes_es(3))
print(que_fecha_es(3,2))

#if __name__ == '__main__':   #por buena practica se hace asi, porque el "main" se refiere a que estas usando este modulo python como programa principal
