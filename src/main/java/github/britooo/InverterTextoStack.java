package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */
        StringBuilder invertido = new StringBuilder();

        Pilha<Character> pilha = new Pilha<>(input.length());

        for(int i = 0; i < input.length(); i++){
            Character charAtual = input.charAt(i);
            pilha.push(charAtual);
        }

        for(int i = 0; i < input.length(); i++){
            invertido.append(pilha.pop());
        }

        return invertido.toString();
    }

}
