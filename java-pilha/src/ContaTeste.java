
public class ContaTeste {

    //atributos omitidos

    public ContaTeste(int agencia, int numero){

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inv�lida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inv�lido");
        }

        //resto do construtor foi omitido
    }
    
}