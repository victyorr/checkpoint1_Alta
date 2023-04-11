package checkpoint;

public class Fila {
	private int ini;
    private int fim;
    private int cont;
    private int N;
    private Mensagem[] dados;

    public void init(int n) {
        ini = 0;
        fim = 0;
        cont = 0;
        N = n;
        dados = new Mensagem[N];
    }

    public void enqueue(Mensagem e) {
        if (isFull()) {
            System.out.println("Fila cheia");
        } else {
            dados[fim] = e;
            fim = (fim + 1) % N;
            cont++;
        }
    }

    public Mensagem dequeue() {
        Mensagem e = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return e;
    }

    public boolean isEmpty() {
        if (cont == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (cont == N)
            return true;
        else
            return false;
    }

    public Mensagem first() {
        return dados[ini];
    }

    public int getIni() {
        return this.ini;
    }
    public int getFim() {
        return this.fim;
    }
}
