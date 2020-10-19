data class Data(val number: Int, val name:String){
}

val Data1: Data = Data(number = 1, name = "C")
val Data2: Data = Data(number = 1, name = "A")
val Data3: Data = Data(number = 2, name = "D")
val Data4: Data = Data(number = 1, name = "E")
val Data5: Data = Data(number = 2, name = "B")

mutableListOf(Data1, Data2, Data3, Data4, Data5).sortedWith(compareBy<Data>{it.number}.thenBy{it.name}).forEach{ println(it)}