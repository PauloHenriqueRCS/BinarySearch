package Files;


public class BinarySearchRecursive {

	public  int searchbinary(int[] vetor, int item) {
		return searchbinary(vetor, item, 0, vetor.length - 1);
	}

	public   int searchbinary(int[] vetor, int item, int esq, int dir) {
		int meio = (esq + dir) / 2;
		int valorMeio = vetor[meio];

		if (esq > dir) {
			System.out.println("Item buscado não encontrado!!");
			return -1;
		} else if (valorMeio == item)
			return meio;
		else if (valorMeio > item)
			return searchbinary(vetor, item, esq, meio - 1);
		else
			return searchbinary(vetor, item, meio + 1, dir);
	}
}
