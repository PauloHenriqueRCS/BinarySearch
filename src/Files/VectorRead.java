package Files;


public class VectorRead {

	public int[] vector;

	public int[] vectorRead(String fileName) throws java.io.IOException {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(fileName)));

		int length = Integer.parseInt(br.readLine());

		vector = new int[length];

		String[] line;

		for (int i = 0; i < 1; i++) {
			line = br.readLine().split(" ");
			for (int j = 0; j < length; j++) {
			vector[j] = Integer.parseInt(line[j]);
		}}
		
		br.close();

		return vector;
	}
	
}
