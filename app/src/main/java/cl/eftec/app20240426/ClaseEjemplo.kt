package cl.eftec.app20240426

class ClaseEjemplo {
    var campo1:String=""
    private var campo2:String=""
    companion object {  // <-- estatico
        var campo3:String="" // <-- singleton.
        var paises=listOf("chile","argentina","peru")
    }
    fun metodo1() {

    }
}