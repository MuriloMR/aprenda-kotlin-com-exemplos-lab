enum  class  Nivel { BASICO , INTERMEDIARIO , AVAN Ç ADO }

classe de dados  Aluno ( val  nome :  String , val  email :  String )

data class  ConteudoEducacional ( val  nome :  String , val  duracao :  Int = 60)

data class  Formacao ( val  nome :  String , val  conteudos :  List < ConteudoEducacional >, val  nivel :  Nivel ) {

    valinscritos = mutableListOf < Aluno >()
    
    fun  matricular ( aluno :  Aluno ) {
         inscritos.add(aluno)
    }
    
    fun  imprimirListaInscritos (){
        for ( usuário inscrito){
            println (usuario.nome)
        }
    }
    
    fun  imprimirGradeFormacao (){
        for (cont in conteudos){
            println ( " ${cont.nome} - ${cont.duracao} " )
        }
    }
}

diversão  principal () {
    // cursos individuais
    val moduloPython =  ConteudoEducacional ( " curso python " , 160 )
    val moduloKotlin =  ConteudoEducacional ( " curso kotlin " , 60 )
    
    val listaConteudos = mutableListOf < ConteudoEducacional >()
    listConteudos.add(moduloPython)
    listConteudos.add(moduloKotlin)
    
    // formação completa com todos os cursos
    val formacaoFullstack =  Formação ( " Formação Fullstack Developer " , listConteudos, Nivel . INTERMEDIARIO )
    
    // Criar lista de usuários
    val  André =  Aluno ( " André " , " dede@gmail.com " ) _
    val  Bruna  =  Aluno ( " Bruna " , " bruna@gmail.com " )
    
    // matriculando usuários na formação
    formacaoFullstack.matricular( André é)
    formacaoFullstack.matricular( Bruna )
    
    println ( " =========================================== " )
    println ( " Dados da formação " )
    println ( " ${formacaoFullstack.nome} - ${formacaoFullstack.nivel} " )
    println ( " Grau de formação " )
    println (formacaoFullstack.imprimirGradeFormacao())
    println ( " ========================================== " )
    println ( " Lista de inscritos " )
    println (formacaoFullstack.imprimirListaInscritos())
}
