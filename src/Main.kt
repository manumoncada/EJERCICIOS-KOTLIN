import kotlin.math.ln

fun main() {
    var votos1: Int;
    var votos2: Int;
    var votos3: Int;
    var totalvotos: Int;


    var costo1: Int;
    var costo2: Int;
    var costo3: Int;
    var costototal: Int;
    var costoaux:Int;

    var porvotos1:Int;
    var porvotos2:Int;
    var porvotos3:Int;


    var procesovivo: Boolean;


    var cadena: String;
    var conocer: Char;
    var borrar: Int;

    var menu = true;

    votos1 = 0;
    votos2 = 0;
    votos3 = 0;
    totalvotos = 0;


    porvotos1 = 0;
    porvotos2 = 0;
    porvotos3 = 0;

    costo1 = 0;
    costo2 = 0;
    costo3 = 0;
    costototal = 0;

    procesovivo = true;



 ;

    while (procesovivo) {

        println(
            """
        buen dia, seleccione una de las opciones 
        1 votar
        2 ver costos de campaña por influencia de voto
        3 vaciar urnas
        4 total de votos
        5 porcentaje de votos
        6 costo promedio de campaña
        7 salir
       
    """.trimIndent()
        );
        cadena = readln();
        when (cadena) {
            "1" -> {
                println(
                    """
                elija su candidato para el municipio premier
                1) candidato 1
                2) candidato 2
                3) candidato 3
            """.trimIndent()
                );
                cadena = readln();

                when (cadena) {
                    "1" -> {
                        votos1 = votos1 + 1;
                        println("a votado por el candidato 1".trimIndent());
                    }
                    "2"-> {
                        votos2 = votos2 +1;
                        println("a votado por el candidato 2");
                    }
                    "3"->{
                        votos3= votos3 + 1;
                        println("a votado por el candidato 3");
                    }
                }

                println("""por que medio conocio a su candidato
                  a) television
                  b) radio
                  c) internet
                """.trimMargin());
                conocer = readln().get(0);
                costoaux=0;
                if (conocer=='a'){
                    costoaux=700000;
                }
                if(conocer=='b'){
                    costoaux=200000;

                }
                if(conocer=='c'){
                    costoaux=600000;
                }
                when (cadena) {
                    "1" -> {
                        costo1 = costoaux+costo1;

                    }
                    "2"-> {
                        costo2 = costoaux+costo2;
                    }
                    "3"->{
                        costo3 = costoaux+costo3;
                    }
                }


            }


            "2" -> {
                println("los costos de capaña del candidato 1 es $ $costo1");
                println("los costos de capaña del candidato 2 $ $costo2");
                println("los costos de capaña del candidato 3 es $ $costo3");
            }

            "3" -> {
                println("""¿esta seguro de vaciar las urnas?
                    |1 si
                    |2 no
             
                """.trimMargin());
                borrar=readln().toInt();

                if(borrar==1){
                    votos1=0;
                    votos2=0;
                    votos3=0;
                    costo1=0;
                    costo2=0;
                    costo3=0;
                    costototal=0;
                    println("se han vaciado las urnas");
                }
            }

            "4" -> {
                println("la cantidad de votos del candidato 1 es $votos1");
                println("la cantidad de votos del candidato 2 es $votos2");
                println("la cantidad de votos del candidato 3 es $votos3");
                totalvotos = votos1+votos2+votos3;
                println("la cantidad total de votos es $totalvotos");
            }
            "5"->{
                totalvotos = votos1+votos2+votos3;
                porvotos1=((votos1*100) / totalvotos);
                println("el procentaje de votos del candidato 1 es $porvotos1 %");

                porvotos2=((votos2*100) / totalvotos);
                println("el procentaje de votos del candidato 2 es $porvotos2 %");

                porvotos3=((votos3*100) / totalvotos);
                println("el procentaje de votos del candidato 2 es $porvotos3 %");
            }
            "6"->{
                costototal = (costo1+costo2+costo3)/3;
                println("el costo promedio de las campañas es de $costototal");
            }
            "7"->{
                procesovivo=false;
            }
        }

    }
}