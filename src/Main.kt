fun main(){

    var pessoa1 = Pessoa("Lucas", 1997, 1.87)
    var pessoa2 = Pessoa("Gabriel", 1995, 1.90)
    var pessoa3 = Pessoa("Silva", 2000, 1.80)
    var pessoa4 = Pessoa( "Galdino", 2001, 1.92)
    var pessoa5 = Pessoa("Ronaldo", 2002, 1.75)
    var pessoa6 = Pessoa("Rivaldo", 1969, 1.78)
    var pessoa7 = Pessoa("Cristiano", 1989, 1.89)
    var pessoa8 = Pessoa("Messi", 1983,1.70)
    var pessoa9 = Pessoa("Ronaldinho", 1979, 1.77)
    var pessoa10 = Pessoa("Iniesta", 1971, 1.79)
    var empregado = Funcionario("Zagalo",10.000)
    var agenda = Agenda()

    println(agenda.printAgenda())
    agenda.armazenaPessoa(pessoa1)
    println(agenda.buscaPessoa("Lucas"))
    agenda.printPessoa(1)
    agenda.armazenaPessoa(empregado)
    println(agenda.printAgenda())
}