
####PYTHON


a = 1767575

x = 4

b = 'prueba'

#c = print('texto') pruedo usar una funcion

#d = 'texto'+123

e = 'texto' + 'otro texto'

r = 1,2,3,4,5,6

print(a+x)
#print(e)
#print(str(a)+b)
#print( (int('1'))+2 )
#print('gdgsgsdg')
#   print(r[3])
#if __name__ == "__main__":


a = [1,3,4,5,21,4]
a[3] = 76
print(a[:-2])

b = (2,3,4,5)
#b[3] = 76
print(b[2])

list_example = [1,3,56,7,"house",3.5, "example", True,"dog"]
print(list_example[2])

tuple_example = (1,"things", 3.14, 9.8, False, 365)

dict_example = {'name' : 'Anthony',
                'lastname' : 'Pernia',
                'DNI' : 5555555555,
                'Mail' : 'anthonyperniahgmail.com',
                'numero_flotante' : 232.545,
                'Tiene_auto?' : False}

print(dict_example['name'])

x = 0
while x<10:
    print(x)
    x+=1 # x=x+1



listaExample = ['Anthony', 'Antonio', 'Nosequien', 'Alguien']

for nombre in listaExample:
    print(nombre)