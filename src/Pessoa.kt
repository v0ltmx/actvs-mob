import java.time.LocalDate

open class Pessoa(nome: String = "", altura: Double = 0.0){
    var nome: String? = null
    private var idade: Int? = null
    private var altura: Double? = null
    var anoNascimento: Int? = null

    init {
        this.nome = nome
        this.altura = altura
    }
    override fun toString() = "$nome ($anoNascimento,$altura)"

    constructor(nome: String, anoNascimento: Int, altura: Double): this(nome, altura){
        this.anoNascimento = anoNascimento
        this.idade = calcularIdade(anoNascimento)

    }
    fun calcularIdade(anoNascimento: Int) = 2021 - anoNascimento

}

