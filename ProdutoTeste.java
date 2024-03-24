
public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto ();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto=0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1=p1.precoComDesconto(0);
		double precoFinal2=p2.precoComDesconto(0.29);
		double mediaCarrinho = (precoFinal1+precoFinal2)/2;
		
		System.out.printf("Os valores com desconto deram: R$%.2f e R$%.2f.",p1.precoComDesconto(0),p2.precoComDesconto(0.29));
		System.out.println("");
		System.out.printf("A média do Carrinho foi: R$%.2f.",mediaCarrinho);
	}
}
