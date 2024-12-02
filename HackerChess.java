package quesBank3;

int n = potential.size();
int[] potentials = new int[n];
for(int i=0;i<n;i++) {
	potentials[i]=potential.get(i);
}
int consecutiveWins =0;
int currentPotential = potentials[0];
for(int i=1;i<potentials.length;i++) {
	if(potential[i]<currentPotential) {
		consecutiveWins++;
		if(consecutiveWins>=k) {
			return currentPotential;
		}
	}else {
		currentPotential = potentials[i];
		consecutiveWins =0;
	}
}
return currentPotential;
}
}
public class HackerChess {

}


/*
 import java.util.*;

abstract class Book {
    String title;
    
    // Abstract method to set the title
    abstract void setTitle(String s);
    
    // Method to get the title
    String getTitle() {
        return title;
    }
}

// MyBook class that extends Book and implements the abstract method setTitle
class MyBook extends Book {
    
    // Concrete implementation of the abstract setTitle method
    @Override
    void setTitle(String s) {
        title = s;  // Sets the title to the value of the input string
    }
}

public class Main {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the title from user input
        String title = sc.nextLine();
        
        // Create an instance of MyBook
        MyBook new_novel = new MyBook();
        
        // Set the title using the setTitle method
        new_novel.setTitle(title);
        
        // Output the title using the getTitle method
        System.out.println("The title is: " + new_novel.getTitle());
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}


 * 
 */

/*
 * import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
 * */
