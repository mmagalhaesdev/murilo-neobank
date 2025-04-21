package principal;
import javax.swing.JOptionPane;
public class ContaCorrente extends Conta{
    //Declarando uma variável do tipo private como limiteEspecial
    private double limiteEspecial = 1;
    //Método que recebe como parâmetro valor, informado em MenuConta()
    public void sacar(double valor){
        //Criando uma variável que receba o retorno de getSaldo, ou seja, o valor de saldo
        double saldo = getSaldo();
        //Se saldo for menor que o limite, informa uma mensagem
        if(saldo < limiteEspecial){
            JOptionPane.showMessageDialog(null, "Saldo menor que LimiteEspecial");
        }
        //Se saldo não for menor que o limiteEspecial, irá executar o método saldo em Conta
        else{
            super.sacar(valor);
        }
    }
    //Método que irá exibir o saldo disponível para o usuário
    public String toString(){
         //Criando uma variável que receba o retorno de getSaldo, ou seja, o valor de saldo
        double saldo = getSaldo();
        //Retorna o valor de saldo
        return "Informações da Conta: \nSaldo: "+ saldo;
    }
}
