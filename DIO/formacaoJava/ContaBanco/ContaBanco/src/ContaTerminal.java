import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Agência !");
		Integer numeroAgencia = Integer.parseInt(scanner.nextLine());

		System.out.println("Por favor, digite o nome da Agência !");
		String nomeAgencia = scanner.nextLine();

		System.out.println("Por favor, digite o Nome Cliente!");
		String nomeCliente = scanner.nextLine();

		System.out.println("Por favor, digite o saldo");
		Float saldo = Float.parseFloat(scanner.nextLine());

		scanner.close();

		System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
				+ nomeAgencia + ", conta numero " + numeroAgencia + " e seu saldo " + saldo
				+ " já está disponível para saque.");

	}
}
