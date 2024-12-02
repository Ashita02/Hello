package quesBank3;

class ValidationException extends Exception{
	public ValidationException(String message) {
		super(message);
	}
}
public class SortCharacters {
	public String encrypt(String name) throws ValidationException{
		if(validate(name)) {
			return reverseAndLowercase(name);
		}else {
			throw new ValidationException("Invalid input : " + name);
		}
	}
	private boolean validate(String name) {
		return ! name.isEmpty() && name.matches("[a-z A-Z]+");
		}
	private String reverseAndLowercase(String input) {
		StringBuilder reversed = new StringBuilder(input).reverse();
		return reversed.toString().toLowerCase();	
		}
	public static void main(String[] args) {
		 SortCharacters encrypter = new SortCharacters();
		 try {
			 String encrypted = encrypter.encrypt("ASHITA");
			 System.out.println("Encrypted :" + encrypted);
		 }catch(ValidationException e){
			System.out.println("validation error : " + e.getMessage());
		 }
	}
}
