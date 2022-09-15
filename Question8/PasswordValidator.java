package Question8;

import java.util.zip.DataFormatException;

class InvalidPasswordException extends Exception {
		  
	    int passwordConditionViolated = 0;
	  
	    public InvalidPasswordException(int conditionViolated)
	    {
	        super("Invalid Password: ");
	        passwordConditionViolated = conditionViolated;
	    }
	  
	    public String printMessage()
	    {
	     switch (passwordConditionViolated) {
	        case 1:
	            return ("Password length should be"
	                    + " between 8 to 14 characters");
	        case 2:
	            return ("Password should not"
	                    + " contain any space");
	        case 3:
	            return ("Password should contain"
	                    + " at least one digit(0-9)");
	        case 4:
	            return ("Password should contain at "
	                    + "two special character");
	        case 5:
	            return ("Password should contain at"
	                    + " two uppercase letter(A-Z)");
	        case 6:
	            return ("Password should contain at"
	                    + " two lowercase letter(a-z)");
	        }
	  
	        return ("");
	    }
	}
	public class PasswordValidator {
	    public static void isValid(String password)
	        throws InvalidPasswordException
	    {
	    if (!((password.length() >= 8)
	              && (password.length() <= 14))) {
	            throw new InvalidPasswordException(1);
	        }
	        if (password.contains(" ")) {
	            throw new InvalidPasswordException(2);
	        }
	        if (true) {
	            int count = 0;
	            for (int i = 0; i <= 9; i++) {
	                String str1 = Integer.toString(i);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new InvalidPasswordException(3);
	            }
	        }
	        if (!(password.contains("@") || password.contains("#")
	              || password.contains("!") || password.contains("~")
	              || password.contains("$") || password.contains("%")
	              || password.contains("^") || password.contains("&")
	              || password.contains("*") || password.contains("(")
	              || password.contains(")") || password.contains("-")
	              || password.contains("+") || password.contains("/")
	              || password.contains(":") || password.contains(".")
	              || password.contains(", ") || password.contains("<")
	              || password.contains(">") || password.contains("?")
	              || password.contains("|"))) {
	            throw new InvalidPasswordException(4);
	        }
	  
	        if (true) {
	            int count = 0;
	   // checking capital letters
	            for (int i = 65; i <= 90; i++) {
        // type casting
	                 char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new InvalidPasswordException(5);
	            }
	        }
	  
	        if (true) {
	            int count = 0;
               // checking small letters
	            for (int i = 90; i <= 122; i++) {
	           // type casting
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new InvalidPasswordException(6);
	            }
	        }
	  
	        // The password is valid
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        String password1 = "sdfghjklijuf";
	  
	        try {
	            System.out.println("Is Password "
	                               + password1 + " valid?");
	            isValid(password1);
	            System.out.println("Valid Password");
	        }
	        catch (InvalidPasswordException e) {
	            System.out.print(e.getMessage());
	            System.out.println(e.printMessage());
	        } }
	}
