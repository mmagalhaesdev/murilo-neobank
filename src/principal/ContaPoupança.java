package principal;
import javax.swing.JOptionPane;
public class ContaPoupança extends Conta{
    //Criando variável do tipo private double com o valor de reajusteMensal
    private double reajusteMensal;
    //Criando um método atualizarSaldo que recebe um parâmetro informado em MenuConta()
    public void atualizarSaldo(double valor){
        //Se esse valor for menor igual a zero, informa a mensagem para o usuário
        if(valor <=0){
             JOptionPane.showMessageDialog(null, "Desculpe, valor negativo ou igula a zero");
        }
        //Senão for menor igual a zero, executa o método atualizarSaldo() de Conta com o parâmetro valor
        else{
            super.atualizarSaldo(valor);
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
