package principal;
import javax.swing.JOptionPane;
public class Conta {
    //Criando a variãvel saldo do tipo private double
    private double saldo;
    //Método getSaldo() que permite outras classes acessar saldo, porque ele é private
    public double getSaldo(){
        return saldo;
    }
    //Método que recebe como parâmetro valor informado em MenuConta()
    public void depositar(double valor){
        //Se esse valor é menor ou igual a zero, informa uma mensagem
         if(valor <= 0 ){
             JOptionPane.showMessageDialog(null, "Desculpe, valor negativo ou igul a a zero");
         }
         // Senão for menor igual a zero, adiciona o valor em saldo
         else{
             saldo  = saldo + valor;
         }
    }
    //Método que recebe como parâmetro valor informado em MenuConta()
     public void sacar(double valor){
        // Se o valor informado for maior que saldo, exibe uma mensagem
        if(saldo<valor){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
        else {
            //Se esse valor é menor ou igual a zero, informa uma mensagem
            if(valor <= 0 ){
             JOptionPane.showMessageDialog(null, "Desculpe, valor negativo ou igula a zero");
            }
             // Se saldo não for menor que o valor informado e não for menor ou igual a zero, subtrai o valor em saldo
            else{
                saldo = saldo - valor;
            }
        }
    }
    //Método que recebe como parÂmetro valor informado em MenuConta()
    public void atualizarSaldo(double valor){
        //Se o saldo for menor que zero, ou seja, negativo, ocorrerá um aumento de 8%
        if(saldo<0){
            //Inicializa uma variável que receberá o calculo da porcentagem de 8% de saldo
               double saldo1 = (saldo*-1)*0.08;
                //Saldo recebe o aumento
               saldo = saldo - saldo1;
               //Exibe uma mensagem com o novo aumento em saldo
               JOptionPane.showMessageDialog(null, "O valor atualizado do saldo com taxa de 8% é:" +saldo);
        }
        //Se o saldo for maior que zero ou igual e o parâmetro informado for zero, para o cado de contaCC, informará uma mensagem
        if(saldo >= 0 && valor == 0){
            JOptionPane.showMessageDialog(null, "Saldo positivo.");
        }
        //Se o saldo for maior que zero e o parâmetro informado for maior que zero, executará a seguinte ação:
        if(valor > 0 && saldo > 0){
            //Saldo recebe o novo valor atualizado, ou seja, acrescentado uma porcentagem sobre saldo informado pelo usuário
            saldo = (saldo*(valor/100)) + saldo;
            //Exibe uma mensagem com o novo aumento em saldo
            JOptionPane.showMessageDialog(null, "O valor atualizado do saldo com taxa de" +valor+"% é: " +saldo);
        }
        //Se valor for maior que zero, caso de contaCP, mas saldo for igual a zero, informa a mensagem
        if(valor > 0 && saldo == 0){
             JOptionPane.showMessageDialog(null, "Saldo zerado");
        }
    }
}

