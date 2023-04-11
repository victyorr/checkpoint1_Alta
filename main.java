package checkpoint;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.init(10);
		Scanner sc = new Scanner(System.in);
		
		int opcao, contato, cont;
		String nome, email, telefone, mensagem;
		
		
		do {
			System.out.println("Voce quer receber uma mensagem ou atender uma mensagem");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					Mensagem msg = new Mensagem();
					// validar para colocar um numero valido
					System.out.println("Voce vai fazer o contato por: 1 - Email 2 - Telefone");
					contato = sc.nextInt();
					// nao precisa do switch case pq que o motivo ja ta na mensagem.
					ver: while (contato != 1 || contato != 2) {
						switch (contato) {
						case 1:
							sc.nextLine();
							System.out.println("Qual e o seu nome: (opcional)");
							msg.setNome(sc.nextLine());
							System.out.println("Digite o seu email");			
							msg.setEmail(sc.nextLine());
							System.out.println("Qual e a sua mensagem:");
							msg.setMensagem(sc.nextLine());
							System.out.println("Qual e o seu motivo de contato? 1 - Reclamacao 2 - Sugestao");
							cont = sc.nextInt();
							
							System.out.println(msg.getNome());
							System.out.println(msg.getEmail());
							System.out.println(msg.getMensagem());
							
							if (cont == 1) {
								// fila reclamaçao
							} else if (cont == 2) {
								// fila sugestao
							}
							break ver;
						case 2:
							System.out.println("Qual e o seu nome: (opcional)");
							msg.setEmail(sc.next());
							System.out.println("Qual e a sua mensagem:");
							msg.setMensagem(sc.next());
							System.out.println("Qual e o seu motivo de contato? 1 - Reclamaçao 2 - Sugestao");
							cont = sc.nextInt();

							System.out.println(msg.getNome());
							System.out.println(msg.getTelefone());
							System.out.println(msg.getMensagem());
							
							if (cont == 1) {
								// fila reclamaçao
							} else if (cont == 2) {
								// TODO: fila sugestao
							}
							break ver;
						default:
							System.out.println("Digite uma opcao valida");
							System.out.println("Voce vai fazer o contato por: 1 - Email 2 - Telefone");
							contato = sc.nextInt();
							break;
						}
					}
					break;
					
				case 2:
					// ver qual mensagem voce quer responder reclamaçao, sugestao
					
					// dequeue da fila que voce selecionou
					
					// print da mensagem
					
					// faz um scanner de string para saber se a mensagem e facil (a) ou dificil (b)
					
					// if a mensagem for dificil encamiar para a fila resoluçao
					
					// se for facil print "Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
					break;
				case 3:
					// msg = dequeue da fila de resolucao
					
					// print da msg mensagem
					
					// print da mensagem "Enviada resposta para cliente: sua solicitação já foi resolvida. Obrigado!!!");
					break;
				case 0: 
					break;
				default:
					// print comando errado digite novamente um numero valido
					break;
			}
		} while (opcao != 0);
		
		
		if (!fila.isEmpty()) 
            System.out.println("Valor retirado da fila: " + fila.dequeue());
        else
            System.out.println("Fila vazia");
	}

}
