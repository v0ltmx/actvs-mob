class Agenda(val size: Int = 10 ) {

    val listaPessoas = ArrayList<Pessoa>()


    fun armazenaPessoa(pessoa: Pessoa)= listaPessoas.add(pessoa)
    fun removePessoa(nome: String){
        for (i in listaPessoas){
            if(nome === i.nome){
                listaPessoas.remove(i)
            }
        }
    }
    fun buscaPessoa(nome:String): Pessoa {
        for (i in listaPessoas){
            if(nome === i.nome){
                return i
            }
        }
    }
    fun printAgenda(){
        for (i in listaPessoas)
            println(i)
    }

    fun printPessoa(valor: Int){
        for (i in listaPessoas){
            if(listaPessoas.indexOf(i) == valor)
                print(i)
        }
    }
}