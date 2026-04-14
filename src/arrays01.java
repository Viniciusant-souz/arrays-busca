public class arrays01 {

    public static void main(String[] args) {
        String [] produtos = {"Mouse", "Teclado", "PC", "Estabilizador", "Pen-Drive", "Cabo HDMI", "Roteador", "Mouse", "PC", "Mouse"};

        System.out.println("-------- LISTA DE PRODUTOS DE INFORMÁTICA --------");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto no índice " + i + ": " + produtos[i]);
        }

        String buscar = "Mouse";
        int retornoDaBusca = -1;

        for (int i = 0; i < produtos.length; i++){
            if (buscar.equals(produtos[i])){
                retornoDaBusca = i;
                break;
            }

        }

        if (retornoDaBusca != -1){
            System.out.println("O produto: " + buscar + " foi encontrado na posição: " + retornoDaBusca);
        }
        else {
            System.out.println("Produto não encontrado!");
        }

    }
}
