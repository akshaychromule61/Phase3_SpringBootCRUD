package src.string.secret.program;

public class StringSecret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secretMessage = "Bzwarz!1It9is3java2whzn1you5arz4using3phonzs8during1thz9szssions";
		System.out.println(secretMessage);
		System.out.println("Replace all occurrences of the letter 'z' with the letter 'e'");
		secretMessage = secretMessage.replace('z', 'e');
		System.out.println("Replace all the digits with a space");
		secretMessage = secretMessage.replaceAll("[0-9]", " ");
		System.out.println("Replace the first occurrence of \"java\" with \"obvious\".");
		secretMessage = secretMessage.replaceFirst("java", "obvious");
		System.out.println(secretMessage);
		
		//by using lambda expression
		String str1 = "Bzwarz!1It9is3java2whzn1you5arz4using3phonzs8during1thz9szssions";
		System.out.println((str1.replace("z", "e")).replaceAll("[0-9]", " ").replaceFirst("java", "obvious"));
	}

}
