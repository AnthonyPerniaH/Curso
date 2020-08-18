function queMesEs(mes){
    var meses = ['enero',"febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"]
    return meses[mes]
}

function queDiaEs(dia) {
    var dias = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"]
    return dias[dia]
}

function fecha(dia,mes){
    return [queDiaEs(dia),queMesEs(mes)]
}


console.log(queMesEs(1))
console.log((queDiaEs(3)))
console.log(fecha(4,5))