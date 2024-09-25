public class Turma {
    private String curso;
    private String periodo;
    private String modalidade;

    // métodos para inserir valores
    public void setCurso (String curso_p){
        this.curso = curso_p;
    }    

    public void setPeriodo(String periodo_p){
       validaPeriodo(periodo_p);
    }

    public void setModalidade(String modalidade_p){
        this.modalidade = modalidade_p;
    }

    // Métodos para recuperar os valores
    public String getCurso(){
        return this.curso;
    }

    public String getModalidade(){
        return this.modalidade;
    }
    public String getPeriodo(){
        return this.periodo;
    }

    public void validaPeriodo(String periodo_p){
        if (periodo_p == "Noturno" 
        || periodo_p == "Matutino" 
        || periodo_p == "Vespertino"){
            this.periodo = periodo_p;
            //ou
            setPeriodo(periodo_p);
        }else{
            System.out.println("Informação incorreta!");
        }
    }

    

}
