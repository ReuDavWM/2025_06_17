//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // val <változóNeve> = "..."
    val a_nevem: String = "Dávid"
    println("Az én nevem ${a_nevem}!")

    var szam: Float = 7f
    var szam_2: Float = 5f
    println("${szam.toInt()} + ${szam_2.toInt()} = ${ (szam + szam_2).toInt() }")
    println("${szam} - ${szam_2} = ${szam - szam_2}")
    println("${szam} / ${szam_2} = ${szam / szam_2}")
    println("${szam} * ${szam_2} = ${szam * szam_2}")
    // FELADAT
    // írd ki ennek a 2 számnak a:
    // összegét +
    // különbségét -
    // szorzatát *
    // osztás /
    // így írjuk ki: pl.: 5 + 7 = 12

    print("Kérlek írj be valamit: ")
    var bekert_szoveg = readln()
    if(bekert_szoveg.isEmpty()){
        println("HIBA: Nem adtál meg semmilyen szöveget!")
    }
    if(!bekert_szoveg.isEmpty()){
        println(bekert_szoveg)
    }

}