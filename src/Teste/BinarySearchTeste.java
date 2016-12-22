package Teste;

import java.io.IOException;

import Files.*;

public class BinarySearchTeste {
	
	public static void main(String[] args) throws IOException {
		
		BinarySearchRecursive bsr = new BinarySearchRecursive();
		BinarySearchIterative bsi = new BinarySearchIterative();
		VectorRead vector = new VectorRead();
		int [] v = (vector.vectorRead("vetor.txt"));
		int buscar = 11;	
		
		// Recursivo
		System.out.println("A posição do " + buscar + " no vetor é: " + (bsr.searchbinary(v, buscar)));
		// Iterativo
		System.out.println("A posição do " + buscar + " no vetor é: " + (bsi.searchbinary(v, buscar)));
	}
}
