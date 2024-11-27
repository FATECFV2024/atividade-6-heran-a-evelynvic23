public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    
    public void getEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularIrpf(){
        double aux;
        if(salario < 1800){
            aux = 0.1 * salario;
        }else{
            aux = 0.27*salario;
        }
        return (aux);
    }

    public double calcularInss(){
        if(salario<1412.01){
            return salario*0.075;
        }
        else if(salario>=1412.01 && salario < 2666.69){
            return salario*0.09;
        }
        else if(salario >= 2666.69 && salario < 4000.04){
            return salario * 0.12;
        }
        else if(salario >= 4000.04 && salario < 7786.03){
            return salario*0.14;
        }
        else{
            return 7786.03*0.14;
        }
    }

}   
