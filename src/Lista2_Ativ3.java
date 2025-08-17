import javax.swing.JOptionPane;

public class Lista2_Ativ3 {

	public static void main(String[] args) {
		int[] vet = {5, 1, 7, 8, 11, 4, 7, 8};
		int b = vet.length -1;
		int a = rec(vet, b, 0);
		JOptionPane.showMessageDialog(null, "O total de n° pares é: " + a);
	}

	public static int rec(int[] vet, int b, int cont){
		
		if (b < 0) {
			return cont;
		} else if (vet[b] % 2 == 0) {
			return rec(vet, b-1, cont+1);
		}else {
			return rec(vet, b-1, cont);
		}
		
	}

}
