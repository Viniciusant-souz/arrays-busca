public class Main {
    public static void main(String[] args) {


        /*
        System.out.println("=== SISTEMA DE BUSCA EM ARRAY ===\n");

        // Array de produtos
        String[] produtos = {"Notebook", "Mouse", "Teclado", "Monitor", "Mouse", "Cadeira", "Mouse", "Webcam"};

        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("   [" + i + "] " + produtos[i]);
        }

        // 1. Buscar um produto (primeira ocorrência)
        String buscar = "Mouse";
        int posicao = -1;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(buscar)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("\n✅ Produto '" + buscar + "' encontrado na posição " + posicao);
        } else {
            System.out.println("\n❌ Produto '" + buscar + "' NÃO encontrado!");
        }

        // 2. Contar quantas vezes um produto aparece
        String contarProduto = "Mouse";
        int quantidade = 0;

        for (String produto : produtos) {
            if (produto.equals(contarProduto)) {
                quantidade++;
            }
        }
        System.out.println("📊 O produto '" + contarProduto + "' aparece " + quantidade + " vezes");

        // 3. Listar posições de todas as ocorrências
        System.out.print("\n📍 Posições do produto 'Mouse': ");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals("Mouse")) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 4. Produto mais curto e mais longo
        String maisCurto = produtos[0];
        String maisLongo = produtos[0];

        for (String produto : produtos) {
            if (produto.length() < maisCurto.length()) {
                maisCurto = produto;
            }
            if (produto.length() > maisLongo.length()) {
                maisLongo = produto;
            }
        }
        System.out.println("\n📏 Produto mais curto: " + maisCurto);
        System.out.println("📏 Produto mais longo: " + maisLongo);

         */

        int[] num = new int[4];
        num[0] = 1;
        num[1] = 10;
        num[2] = 100;
        num[3] = 1000;
        num[4] = 10000;

        for (int i = 0; i<= num.length; i++){
            System.out.println(""+ num[i]);
        }




    }



}