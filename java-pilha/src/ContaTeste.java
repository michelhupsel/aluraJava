
public class ContaTeste {

    //atributos omitidos

    public ContaTeste(int agencia, int numero){

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }

        //resto do construtor foi omitido
    }
    
}