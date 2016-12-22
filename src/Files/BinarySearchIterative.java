package Files;


public class BinarySearchIterative {

	public int searchbinary(int[] vetor, int item) {

		int esq = 0;
		int dir = vetor.length - 1;
		int meio;
		while (esq <= dir) {
			meio = (esq + dir) / 2;
			if (item == vetor[meio])
				return meio;
			if (item < vetor[meio])
				dir = meio - 1;
			else
				esq = meio + 1;
		}
		System.out.println("Item buscado não encontrado!!");
		return -1;
	}
}
