
fun main() {

    println("ingrese su dinero inicial")
    val dineroinicial = readln()
    val numero =  (1..3).random()
    println("el numero al azar es el "+ numero)


    when (numero){

        1 -> {
           val dinerofinal = dineroinicial.toInt() * 2
            if (numero =)
            println("felicidades su dinero ahora es " + dinerofinal )
        }
        2->{
            val dinerofinal = dineroinicial.toInt() / 2
                println("lo sentimos, has perdido la mitad de tu dinero, el restante es " + dinerofinal)

        }
        3->{
            val dinerofinal = dineroinicial.toInt() * 0
                println("mala suerte, has perdido todo tu dinero")
        }
    }




}